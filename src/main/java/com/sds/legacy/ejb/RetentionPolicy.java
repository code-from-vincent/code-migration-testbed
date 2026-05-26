package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface RetentionPolicy extends DefaultSession {
    HashMap insertRetentionPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRetentionPolicyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRetentionPolicyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRetentionPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRetentionPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
