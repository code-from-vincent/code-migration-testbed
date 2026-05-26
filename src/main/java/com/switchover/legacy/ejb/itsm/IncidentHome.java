package com.switchover.legacy.ejb.itsm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface IncidentHome extends EJBHome {
    Incident create() throws CreateException, RemoteException;
}