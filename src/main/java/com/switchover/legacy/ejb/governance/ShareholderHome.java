package com.switchover.legacy.ejb.governance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ShareholderHome extends EJBHome {
    Shareholder create() throws CreateException, RemoteException;
}