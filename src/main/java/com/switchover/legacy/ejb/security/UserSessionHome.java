package com.switchover.legacy.ejb.security;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface UserSessionHome extends EJBHome {
    UserSession create() throws CreateException, RemoteException;
}