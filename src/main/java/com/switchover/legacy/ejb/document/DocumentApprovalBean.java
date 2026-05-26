package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DocumentApprovalBean extends DefaultSession {
    private final DocumentApprovalEJBDAO documentApprovalEJBDAO = new DocumentApprovalEJBDAO();
    public HashMap insertDocumentApproval(DefaultParameters param) throws DefaultEJBException {
        return documentApprovalEJBDAO.insertDocumentApproval(param);
    }
    public Collection selectDocumentApprovalList(DefaultParameters param) throws DefaultEJBException {
        return documentApprovalEJBDAO.selectDocumentApprovalList(param);
    }
    public HashMap selectDocumentApprovalDetail(DefaultParameters param) throws DefaultEJBException {
        return documentApprovalEJBDAO.selectDocumentApprovalDetail(param);
    }
    public HashMap updateDocumentApproval(DefaultParameters param) throws DefaultEJBException {
        return documentApprovalEJBDAO.updateDocumentApproval(param);
    }
    public HashMap deleteDocumentApproval(DefaultParameters param) throws DefaultEJBException {
        return documentApprovalEJBDAO.deleteDocumentApproval(param);
    }
}