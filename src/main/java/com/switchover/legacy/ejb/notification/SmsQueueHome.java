package com.switchover.legacy.ejb.notification;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SmsQueueHome extends EJBHome {
    SmsQueue create() throws CreateException, RemoteException;
}