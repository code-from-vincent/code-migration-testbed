package com.switchover.legacy.ejb.procurement;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PurchaseOrderItemHome extends EJBHome {
    PurchaseOrderItem create() throws CreateException, RemoteException;
}