package com.switchover.legacy.ejb.finance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface GeneralLedgerHome extends EJBHome {
    GeneralLedger create() throws CreateException, RemoteException;
}