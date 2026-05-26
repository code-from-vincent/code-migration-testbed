package com.switchover.legacy.ejb.itsm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ServiceRequestHome extends EJBHome {
    ServiceRequest create() throws CreateException, RemoteException;
}