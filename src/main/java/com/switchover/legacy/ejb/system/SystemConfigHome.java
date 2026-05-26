package com.switchover.legacy.ejb.system;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SystemConfigHome extends EJBHome {
    SystemConfig create() throws CreateException, RemoteException;
}