package com.switchover.legacy.ejb.sales;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface CustomerContactHome extends EJBHome {
    CustomerContact create() throws CreateException, RemoteException;
}