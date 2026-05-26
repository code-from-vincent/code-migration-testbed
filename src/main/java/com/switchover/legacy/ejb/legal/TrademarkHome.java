package com.switchover.legacy.ejb.legal;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface TrademarkHome extends EJBHome {
    Trademark create() throws CreateException, RemoteException;
}