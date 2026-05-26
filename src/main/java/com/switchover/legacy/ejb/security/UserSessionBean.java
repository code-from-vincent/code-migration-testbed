package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class UserSessionBean extends DefaultSession {
    private final UserSessionEJBDAO userSessionEJBDAO = new UserSessionEJBDAO();
    public HashMap insertUserSession(DefaultParameters param) throws DefaultEJBException {
        return userSessionEJBDAO.insertUserSession(param);
    }
    public Collection selectUserSessionList(DefaultParameters param) throws DefaultEJBException {
        return userSessionEJBDAO.selectUserSessionList(param);
    }
    public HashMap selectUserSessionDetail(DefaultParameters param) throws DefaultEJBException {
        return userSessionEJBDAO.selectUserSessionDetail(param);
    }
    public HashMap updateUserSession(DefaultParameters param) throws DefaultEJBException {
        return userSessionEJBDAO.updateUserSession(param);
    }
    public HashMap deleteUserSession(DefaultParameters param) throws DefaultEJBException {
        return userSessionEJBDAO.deleteUserSession(param);
    }
}