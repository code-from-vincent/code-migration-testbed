package com.switchover.legacy.ejb.sales;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SalesOrderHome extends EJBHome {
    SalesOrder create() throws CreateException, RemoteException;
}