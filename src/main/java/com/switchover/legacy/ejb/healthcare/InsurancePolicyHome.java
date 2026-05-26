package com.switchover.legacy.ejb.healthcare;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface InsurancePolicyHome extends EJBHome {
    InsurancePolicy create() throws CreateException, RemoteException;
}