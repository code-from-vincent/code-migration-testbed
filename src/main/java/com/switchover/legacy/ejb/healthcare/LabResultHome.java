package com.switchover.legacy.ejb.healthcare;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface LabResultHome extends EJBHome {
    LabResult create() throws CreateException, RemoteException;
}