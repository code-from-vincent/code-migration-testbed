package com.switchover.legacy.ejb.procurement;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PurchaseOrderHome extends EJBHome {
    PurchaseOrder create() throws CreateException, RemoteException;
}