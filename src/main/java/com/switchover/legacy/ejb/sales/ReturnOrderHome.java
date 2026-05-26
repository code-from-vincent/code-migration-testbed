package com.switchover.legacy.ejb.sales;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ReturnOrderHome extends EJBHome {
    ReturnOrder create() throws CreateException, RemoteException;
}