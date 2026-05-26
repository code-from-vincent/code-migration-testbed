package com.switchover.legacy.ejb.healthcare;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PatientRecordHome extends EJBHome {
    PatientRecord create() throws CreateException, RemoteException;
}