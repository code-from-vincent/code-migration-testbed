package com.switchover.legacy.ejb.rd;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SampleInventoryHome extends EJBHome {
    SampleInventory create() throws CreateException, RemoteException;
}