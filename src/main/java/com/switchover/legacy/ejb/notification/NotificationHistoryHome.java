package com.switchover.legacy.ejb.notification;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface NotificationHistoryHome extends EJBHome {
    NotificationHistory create() throws CreateException, RemoteException;
}