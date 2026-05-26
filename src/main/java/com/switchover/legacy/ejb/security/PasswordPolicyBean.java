package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PasswordPolicyBean extends DefaultSession {
    private final PasswordPolicyEJBDAO passwordPolicyEJBDAO = new PasswordPolicyEJBDAO();
    public HashMap insertPasswordPolicy(DefaultParameters param) throws DefaultEJBException {
        return passwordPolicyEJBDAO.insertPasswordPolicy(param);
    }
    public Collection selectPasswordPolicyList(DefaultParameters param) throws DefaultEJBException {
        return passwordPolicyEJBDAO.selectPasswordPolicyList(param);
    }
    public HashMap selectPasswordPolicyDetail(DefaultParameters param) throws DefaultEJBException {
        return passwordPolicyEJBDAO.selectPasswordPolicyDetail(param);
    }
    public HashMap updatePasswordPolicy(DefaultParameters param) throws DefaultEJBException {
        return passwordPolicyEJBDAO.updatePasswordPolicy(param);
    }
    public HashMap deletePasswordPolicy(DefaultParameters param) throws DefaultEJBException {
        return passwordPolicyEJBDAO.deletePasswordPolicy(param);
    }
}