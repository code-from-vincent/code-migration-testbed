package com.switchover.legacy.ejb.product;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface StockAdjustmentHome extends EJBHome {
    StockAdjustment create() throws CreateException, RemoteException;
}