package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class InsurancePolicyBean extends DefaultSession {
    private final InsurancePolicyEJBDAO insurancePolicyEJBDAO = new InsurancePolicyEJBDAO();
    public HashMap insertInsurancePolicy(DefaultParameters param) throws DefaultEJBException {
        return insurancePolicyEJBDAO.insertInsurancePolicy(param);
    }
    public Collection selectInsurancePolicyList(DefaultParameters param) throws DefaultEJBException {
        return insurancePolicyEJBDAO.selectInsurancePolicyList(param);
    }
    public HashMap selectInsurancePolicyDetail(DefaultParameters param) throws DefaultEJBException {
        return insurancePolicyEJBDAO.selectInsurancePolicyDetail(param);
    }
    public HashMap updateInsurancePolicy(DefaultParameters param) throws DefaultEJBException {
        return insurancePolicyEJBDAO.updateInsurancePolicy(param);
    }
    public HashMap deleteInsurancePolicy(DefaultParameters param) throws DefaultEJBException {
        return insurancePolicyEJBDAO.deleteInsurancePolicy(param);
    }
}