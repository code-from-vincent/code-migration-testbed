package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class TemplateDocumentBean extends DefaultSession {
    private final TemplateDocumentEJBDAO templateDocumentEJBDAO = new TemplateDocumentEJBDAO();
    public HashMap insertTemplateDocument(DefaultParameters param) throws DefaultEJBException {
        return templateDocumentEJBDAO.insertTemplateDocument(param);
    }
    public Collection selectTemplateDocumentList(DefaultParameters param) throws DefaultEJBException {
        return templateDocumentEJBDAO.selectTemplateDocumentList(param);
    }
    public HashMap selectTemplateDocumentDetail(DefaultParameters param) throws DefaultEJBException {
        return templateDocumentEJBDAO.selectTemplateDocumentDetail(param);
    }
    public HashMap updateTemplateDocument(DefaultParameters param) throws DefaultEJBException {
        return templateDocumentEJBDAO.updateTemplateDocument(param);
    }
    public HashMap deleteTemplateDocument(DefaultParameters param) throws DefaultEJBException {
        return templateDocumentEJBDAO.deleteTemplateDocument(param);
    }
}