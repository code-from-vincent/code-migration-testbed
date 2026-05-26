package com.switchover.legacy.ejb.product;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface AssetMaintenanceHome extends EJBHome {
    AssetMaintenance create() throws CreateException, RemoteException;
}