package com.switchover.legacy.ejb.manufacturing;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface MachineDowntimeHome extends EJBHome {
    MachineDowntime create() throws CreateException, RemoteException;
}