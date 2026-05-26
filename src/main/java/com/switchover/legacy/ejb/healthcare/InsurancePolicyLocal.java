package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface InsurancePolicyLocal extends EJBLocalObject {
    HashMap insertInsurancePolicy(DefaultParameters param) throws DefaultEJBException;
    Collection selectInsurancePolicyList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectInsurancePolicyDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateInsurancePolicy(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteInsurancePolicy(DefaultParameters param) throws DefaultEJBException;
}