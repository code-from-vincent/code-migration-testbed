package com.switchover.legacy.ejb.security;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PatchManagementHome extends EJBHome {
    PatchManagement create() throws CreateException, RemoteException;
}