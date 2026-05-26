package com.switchover.legacy.ejb.notification;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PushSubscriptionHome extends EJBHome {
    PushSubscription create() throws CreateException, RemoteException;
}