package com.switchover.legacy.ejb.finance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface AccountReceivableHome extends EJBHome {
    AccountReceivable create() throws CreateException, RemoteException;
}