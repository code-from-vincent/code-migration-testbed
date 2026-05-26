package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface AccessPolicy extends DefaultSession {
    HashMap insertAccessPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAccessPolicyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAccessPolicyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAccessPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAccessPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
