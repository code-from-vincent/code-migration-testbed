package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DocumentApprovalEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/document/059_documentapproval/DocumentApproval_SQL.xml";
    public HashMap insertDocumentApproval(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DocumentApprovalEJBDAO.InsertDocumentApproval", param);
    }
    public Collection selectDocumentApprovalList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DocumentApprovalEJBDAO.SelectDocumentApprovalList", param);
    }
    public HashMap selectDocumentApprovalDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DocumentApprovalEJBDAO.SelectDocumentApprovalDetail", param);
    }
    public HashMap updateDocumentApproval(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DocumentApprovalEJBDAO.UpdateDocumentApproval", param);
    }
    public HashMap deleteDocumentApproval(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DocumentApprovalEJBDAO.DeleteDocumentApproval", param);
    }
}