package com.switchover.legacy.ejb.governance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface StrategicInitiativeHome extends EJBHome {
    StrategicInitiative create() throws CreateException, RemoteException;
}