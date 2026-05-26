package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class AccessPolicyBean extends DefaultSession {
    private final AccessPolicyEJBDAO accessPolicyEJBDAO = new AccessPolicyEJBDAO();
    public HashMap insertAccessPolicy(DefaultParameters param) throws DefaultEJBException {
        return accessPolicyEJBDAO.insertAccessPolicy(param);
    }
    public Collection selectAccessPolicyList(DefaultParameters param) throws DefaultEJBException {
        return accessPolicyEJBDAO.selectAccessPolicyList(param);
    }
    public HashMap selectAccessPolicyDetail(DefaultParameters param) throws DefaultEJBException {
        return accessPolicyEJBDAO.selectAccessPolicyDetail(param);
    }
    public HashMap updateAccessPolicy(DefaultParameters param) throws DefaultEJBException {
        return accessPolicyEJBDAO.updateAccessPolicy(param);
    }
    public HashMap deleteAccessPolicy(DefaultParameters param) throws DefaultEJBException {
        return accessPolicyEJBDAO.deleteAccessPolicy(param);
    }
}