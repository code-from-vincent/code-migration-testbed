package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PolicyClaim extends DefaultSession {
    HashMap insertPolicyClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPolicyClaimList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPolicyClaimDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePolicyClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePolicyClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
