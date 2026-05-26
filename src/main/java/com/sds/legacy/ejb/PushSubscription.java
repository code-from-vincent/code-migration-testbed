package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PushSubscription extends DefaultSession {
    HashMap insertPushSubscription(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPushSubscriptionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPushSubscriptionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePushSubscription(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePushSubscription(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
