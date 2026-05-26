package com.switchover.legacy.ejb.legal;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PatentHome extends EJBHome {
    Patent create() throws CreateException, RemoteException;
}