package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class RetentionPolicyBean extends DefaultSession {
    private final RetentionPolicyEJBDAO retentionPolicyEJBDAO = new RetentionPolicyEJBDAO();
    public HashMap insertRetentionPolicy(DefaultParameters param) throws DefaultEJBException {
        return retentionPolicyEJBDAO.insertRetentionPolicy(param);
    }
    public Collection selectRetentionPolicyList(DefaultParameters param) throws DefaultEJBException {
        return retentionPolicyEJBDAO.selectRetentionPolicyList(param);
    }
    public HashMap selectRetentionPolicyDetail(DefaultParameters param) throws DefaultEJBException {
        return retentionPolicyEJBDAO.selectRetentionPolicyDetail(param);
    }
    public HashMap updateRetentionPolicy(DefaultParameters param) throws DefaultEJBException {
        return retentionPolicyEJBDAO.updateRetentionPolicy(param);
    }
    public HashMap deleteRetentionPolicy(DefaultParameters param) throws DefaultEJBException {
        return retentionPolicyEJBDAO.deleteRetentionPolicy(param);
    }
}