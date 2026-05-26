package com.switchover.legacy.ejb.security;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface LoginHistoryHome extends EJBHome {
    LoginHistory create() throws CreateException, RemoteException;
}