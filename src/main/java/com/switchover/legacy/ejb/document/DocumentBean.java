package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DocumentBean extends DefaultSession {
    private final DocumentEJBDAO documentEJBDAO = new DocumentEJBDAO();
    public HashMap insertDocument(DefaultParameters param) throws DefaultEJBException {
        return documentEJBDAO.insertDocument(param);
    }
    public Collection selectDocumentList(DefaultParameters param) throws DefaultEJBException {
        return documentEJBDAO.selectDocumentList(param);
    }
    public HashMap selectDocumentDetail(DefaultParameters param) throws DefaultEJBException {
        return documentEJBDAO.selectDocumentDetail(param);
    }
    public HashMap updateDocument(DefaultParameters param) throws DefaultEJBException {
        return documentEJBDAO.updateDocument(param);
    }
    public HashMap deleteDocument(DefaultParameters param) throws DefaultEJBException {
        return documentEJBDAO.deleteDocument(param);
    }
}