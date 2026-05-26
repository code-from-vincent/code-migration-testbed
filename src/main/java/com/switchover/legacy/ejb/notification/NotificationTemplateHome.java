package com.switchover.legacy.ejb.notification;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface NotificationTemplateHome extends EJBHome {
    NotificationTemplate create() throws CreateException, RemoteException;
}