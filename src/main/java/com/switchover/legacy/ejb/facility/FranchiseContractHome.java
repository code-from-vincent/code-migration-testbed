package com.switchover.legacy.ejb.facility;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface FranchiseContractHome extends EJBHome {
    FranchiseContract create() throws CreateException, RemoteException;
}