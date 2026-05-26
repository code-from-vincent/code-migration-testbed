package com.switchover.legacy.ejb.report;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface DashboardHome extends EJBHome {
    Dashboard create() throws CreateException, RemoteException;
}