package com.switchover.legacy.ejb.system;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface MenuHome extends EJBHome {
    Menu create() throws CreateException, RemoteException;
}