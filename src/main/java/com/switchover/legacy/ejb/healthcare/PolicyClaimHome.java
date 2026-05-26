package com.switchover.legacy.ejb.healthcare;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PolicyClaimHome extends EJBHome {
    PolicyClaim create() throws CreateException, RemoteException;
}