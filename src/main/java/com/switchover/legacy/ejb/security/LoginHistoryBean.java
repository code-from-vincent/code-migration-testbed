package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class LoginHistoryBean extends DefaultSession {
    private final LoginHistoryEJBDAO loginHistoryEJBDAO = new LoginHistoryEJBDAO();
    public HashMap insertLoginHistory(DefaultParameters param) throws DefaultEJBException {
        return loginHistoryEJBDAO.insertLoginHistory(param);
    }
    public Collection selectLoginHistoryList(DefaultParameters param) throws DefaultEJBException {
        return loginHistoryEJBDAO.selectLoginHistoryList(param);
    }
    public HashMap selectLoginHistoryDetail(DefaultParameters param) throws DefaultEJBException {
        return loginHistoryEJBDAO.selectLoginHistoryDetail(param);
    }
    public HashMap updateLoginHistory(DefaultParameters param) throws DefaultEJBException {
        return loginHistoryEJBDAO.updateLoginHistory(param);
    }
    public HashMap deleteLoginHistory(DefaultParameters param) throws DefaultEJBException {
        return loginHistoryEJBDAO.deleteLoginHistory(param);
    }
}