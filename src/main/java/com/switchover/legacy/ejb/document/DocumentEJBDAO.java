package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DocumentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/document/058_document/Document_SQL.xml";
    public HashMap insertDocument(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DocumentEJBDAO.InsertDocument", param);
    }
    public Collection selectDocumentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DocumentEJBDAO.SelectDocumentList", param);
    }
    public HashMap selectDocumentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DocumentEJBDAO.SelectDocumentDetail", param);
    }
    public HashMap updateDocument(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DocumentEJBDAO.UpdateDocument", param);
    }
    public HashMap deleteDocument(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DocumentEJBDAO.DeleteDocument", param);
    }
}