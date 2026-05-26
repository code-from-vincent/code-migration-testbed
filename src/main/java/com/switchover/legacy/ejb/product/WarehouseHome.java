package com.switchover.legacy.ejb.product;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface WarehouseHome extends EJBHome {
    Warehouse create() throws CreateException, RemoteException;
}