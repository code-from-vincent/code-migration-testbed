package com.switchover.legacy.ejb.procurement;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ContractHome extends EJBHome {
    Contract create() throws CreateException, RemoteException;
}