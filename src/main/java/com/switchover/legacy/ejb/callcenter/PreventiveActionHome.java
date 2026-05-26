package com.switchover.legacy.ejb.callcenter;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PreventiveActionHome extends EJBHome {
    PreventiveAction create() throws CreateException, RemoteException;
}