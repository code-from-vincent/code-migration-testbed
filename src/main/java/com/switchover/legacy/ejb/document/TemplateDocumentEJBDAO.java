package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class TemplateDocumentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/document/173_templatedocument/TemplateDocument_SQL.xml";
    public HashMap insertTemplateDocument(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TemplateDocumentEJBDAO.InsertTemplateDocument", param);
    }
    public Collection selectTemplateDocumentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "TemplateDocumentEJBDAO.SelectTemplateDocumentList", param);
    }
    public HashMap selectTemplateDocumentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TemplateDocumentEJBDAO.SelectTemplateDocumentDetail", param);
    }
    public HashMap updateTemplateDocument(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TemplateDocumentEJBDAO.UpdateTemplateDocument", param);
    }
    public HashMap deleteTemplateDocument(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TemplateDocumentEJBDAO.DeleteTemplateDocument", param);
    }
}