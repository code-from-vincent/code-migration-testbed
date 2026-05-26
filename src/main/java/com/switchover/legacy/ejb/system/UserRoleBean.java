package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class UserRoleBean extends DefaultSession {
    private final UserRoleEJBDAO userRoleEJBDAO = new UserRoleEJBDAO();
    public HashMap insertUserRole(DefaultParameters param) throws DefaultEJBException {
        return userRoleEJBDAO.insertUserRole(param);
    }
    public Collection selectUserRoleList(DefaultParameters param) throws DefaultEJBException {
        return userRoleEJBDAO.selectUserRoleList(param);
    }
    public HashMap selectUserRoleDetail(DefaultParameters param) throws DefaultEJBException {
        return userRoleEJBDAO.selectUserRoleDetail(param);
    }
    public HashMap updateUserRole(DefaultParameters param) throws DefaultEJBException {
        return userRoleEJBDAO.updateUserRole(param);
    }
    public HashMap deleteUserRole(DefaultParameters param) throws DefaultEJBException {
        return userRoleEJBDAO.deleteUserRole(param);
    }
}