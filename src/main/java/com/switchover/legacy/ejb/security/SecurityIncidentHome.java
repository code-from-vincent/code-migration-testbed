package com.switchover.legacy.ejb.security;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SecurityIncidentHome extends EJBHome {
    SecurityIncident create() throws CreateException, RemoteException;
}