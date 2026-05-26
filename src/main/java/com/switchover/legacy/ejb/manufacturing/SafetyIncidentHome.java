package com.switchover.legacy.ejb.manufacturing;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SafetyIncidentHome extends EJBHome {
    SafetyIncident create() throws CreateException, RemoteException;
}