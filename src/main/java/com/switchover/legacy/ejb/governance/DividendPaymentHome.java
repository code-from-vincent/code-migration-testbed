package com.switchover.legacy.ejb.governance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface DividendPaymentHome extends EJBHome {
    DividendPayment create() throws CreateException, RemoteException;
}