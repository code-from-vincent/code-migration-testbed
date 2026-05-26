package com.switchover.legacy.ejb.healthcare;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PolicyClaim extends EJBObject {
    HashMap insertPolicyClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPolicyClaimList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPolicyClaimDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePolicyClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePolicyClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
