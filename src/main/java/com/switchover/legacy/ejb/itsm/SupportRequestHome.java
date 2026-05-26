package com.switchover.legacy.ejb.itsm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SupportRequestHome extends EJBHome {
    SupportRequest create() throws CreateException, RemoteException;
}