package com.switchover.legacy.ejb.governance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface KpiResultHome extends EJBHome {
    KpiResult create() throws CreateException, RemoteException;
}