package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PolicyClaimLocal extends EJBLocalObject {
    HashMap insertPolicyClaim(DefaultParameters param) throws DefaultEJBException;
    Collection selectPolicyClaimList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPolicyClaimDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePolicyClaim(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePolicyClaim(DefaultParameters param) throws DefaultEJBException;
}