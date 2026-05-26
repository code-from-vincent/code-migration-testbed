package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PolicyClaimBean extends DefaultSession {
    private final PolicyClaimEJBDAO policyClaimEJBDAO = new PolicyClaimEJBDAO();
    public HashMap insertPolicyClaim(DefaultParameters param) throws DefaultEJBException {
        return policyClaimEJBDAO.insertPolicyClaim(param);
    }
    public Collection selectPolicyClaimList(DefaultParameters param) throws DefaultEJBException {
        return policyClaimEJBDAO.selectPolicyClaimList(param);
    }
    public HashMap selectPolicyClaimDetail(DefaultParameters param) throws DefaultEJBException {
        return policyClaimEJBDAO.selectPolicyClaimDetail(param);
    }
    public HashMap updatePolicyClaim(DefaultParameters param) throws DefaultEJBException {
        return policyClaimEJBDAO.updatePolicyClaim(param);
    }
    public HashMap deletePolicyClaim(DefaultParameters param) throws DefaultEJBException {
        return policyClaimEJBDAO.deletePolicyClaim(param);
    }
}