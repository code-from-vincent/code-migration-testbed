package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PrivacyRequestBean extends DefaultSession {
    private final PrivacyRequestEJBDAO privacyRequestEJBDAO = new PrivacyRequestEJBDAO();
    public HashMap insertPrivacyRequest(DefaultParameters param) throws DefaultEJBException {
        return privacyRequestEJBDAO.insertPrivacyRequest(param);
    }
    public Collection selectPrivacyRequestList(DefaultParameters param) throws DefaultEJBException {
        return privacyRequestEJBDAO.selectPrivacyRequestList(param);
    }
    public HashMap selectPrivacyRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return privacyRequestEJBDAO.selectPrivacyRequestDetail(param);
    }
    public HashMap updatePrivacyRequest(DefaultParameters param) throws DefaultEJBException {
        return privacyRequestEJBDAO.updatePrivacyRequest(param);
    }
    public HashMap deletePrivacyRequest(DefaultParameters param) throws DefaultEJBException {
        return privacyRequestEJBDAO.deletePrivacyRequest(param);
    }
}