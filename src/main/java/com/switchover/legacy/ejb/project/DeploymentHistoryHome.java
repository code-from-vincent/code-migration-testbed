package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface DeploymentHistoryHome extends EJBHome {
    DeploymentHistory create() throws CreateException, RemoteException;
}