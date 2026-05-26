package com.switchover.legacy.ejb.callcenter;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface CorrectiveActionHome extends EJBHome {
    CorrectiveAction create() throws CreateException, RemoteException;
}