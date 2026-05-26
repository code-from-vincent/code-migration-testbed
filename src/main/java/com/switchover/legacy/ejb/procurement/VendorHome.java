package com.switchover.legacy.ejb.procurement;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface VendorHome extends EJBHome {
    Vendor create() throws CreateException, RemoteException;
}