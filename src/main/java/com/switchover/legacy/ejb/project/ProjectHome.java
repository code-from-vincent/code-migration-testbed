package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ProjectHome extends EJBHome {
    Project create() throws CreateException, RemoteException;
}