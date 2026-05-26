package com.switchover.legacy.ejb.healthcare;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface MedicalClaimHome extends EJBHome {
    MedicalClaim create() throws CreateException, RemoteException;
}