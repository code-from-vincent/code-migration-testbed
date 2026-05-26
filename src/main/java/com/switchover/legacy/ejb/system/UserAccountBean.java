package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class UserAccountBean extends DefaultSession {
    private final UserAccountEJBDAO userAccountEJBDAO = new UserAccountEJBDAO();
    public HashMap insertUserAccount(DefaultParameters param) throws DefaultEJBException {
        return userAccountEJBDAO.insertUserAccount(param);
    }
    public Collection selectUserAccountList(DefaultParameters param) throws DefaultEJBException {
        return userAccountEJBDAO.selectUserAccountList(param);
    }
    public HashMap selectUserAccountDetail(DefaultParameters param) throws DefaultEJBException {
        return userAccountEJBDAO.selectUserAccountDetail(param);
    }
    public HashMap updateUserAccount(DefaultParameters param) throws DefaultEJBException {
        return userAccountEJBDAO.updateUserAccount(param);
    }
    public HashMap deleteUserAccount(DefaultParameters param) throws DefaultEJBException {
        return userAccountEJBDAO.deleteUserAccount(param);
    }
}