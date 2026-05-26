package kr.some.cmm.frame;
import kr.some.cmm.util.DefaultParameters;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
/**
 * Base DAO for NTIS XML query execution.
 */
public abstract class DefaultEJBDAO {
    protected HashMap executeHashMapQuery(String queryXmlPath, String queryId, DefaultParameters param)
        throws DefaultEJBException {
        HashMap result = new HashMap();
        result.put("queryId", queryId);
        result.put("statement", findQueryStatement(queryXmlPath, queryId));
        result.put("param", param);
        return result;
    }
    protected Collection executeCollectionQuery(String queryXmlPath, String queryId, DefaultParameters param)
        throws DefaultEJBException {
        Collection list = new ArrayList();
        list.add(executeHashMapQuery(queryXmlPath, queryId, param));
        return list;
    }
    protected String findQueryStatement(String queryXmlPath, String queryId) throws DefaultEJBException {
        InputStream in = null;
        try {
            in = Thread.currentThread().getContextClassLoader().getResourceAsStream(queryXmlPath);
            if (in == null) {
                throw new DefaultEJBException("Query XML not found: " + queryXmlPath);
            }
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(false);
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(in);
            NodeList queries = doc.getElementsByTagName("query");
            for (int i = 0; i < queries.getLength(); i++) {
                org.w3c.dom.Node queryNode = queries.item(i);
                org.w3c.dom.Node idAttr = queryNode.getAttributes() == null ? null : queryNode.getAttributes().getNamedItem("id");
                if (idAttr != null && queryId.equals(idAttr.getNodeValue())) {
                    NodeList children = queryNode.getChildNodes();
                    for (int j = 0; j < children.getLength(); j++) {
                        org.w3c.dom.Node child = children.item(j);
                        if ("statement".equals(child.getNodeName())) {
                            return child.getTextContent().trim();
                        }
                    }
                }
            }
            throw new DefaultEJBException("Query id not found: " + queryId + " in " + queryXmlPath);
        } catch (DefaultEJBException e) {
            throw e;
        } catch (Exception e) {
            throw new DefaultEJBException("Failed to load query xml: " + queryXmlPath, e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception ignore) {
                }
            }
        }
    }
}