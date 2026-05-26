package com.switchover.legacy.ejb.procurement;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ContractChangeHome extends EJBHome {
    ContractChange create() throws CreateException, RemoteException;
}