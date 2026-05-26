package com.switchover.legacy.ejb.finance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface CashTransactionHome extends EJBHome {
    CashTransaction create() throws CreateException, RemoteException;
}