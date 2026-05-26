package com.switchover.legacy.ejb.finance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ExchangeRateHome extends EJBHome {
    ExchangeRate create() throws CreateException, RemoteException;
}