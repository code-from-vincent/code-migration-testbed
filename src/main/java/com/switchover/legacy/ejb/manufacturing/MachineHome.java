package com.switchover.legacy.ejb.manufacturing;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface MachineHome extends EJBHome {
    Machine create() throws CreateException, RemoteException;
}