package com.switchover.legacy.ejb.csr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface GrantApplicationHome extends EJBHome {
    GrantApplication create() throws CreateException, RemoteException;
}