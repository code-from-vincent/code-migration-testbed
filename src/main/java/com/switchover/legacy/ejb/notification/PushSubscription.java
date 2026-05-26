package com.switchover.legacy.ejb.notification;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PushSubscription extends EJBObject {
    HashMap insertPushSubscription(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPushSubscriptionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPushSubscriptionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePushSubscription(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePushSubscription(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
