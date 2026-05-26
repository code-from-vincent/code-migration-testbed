package com.switchover.legacy.ejb.logistics;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface VehicleHome extends EJBHome {
    Vehicle create() throws CreateException, RemoteException;
}