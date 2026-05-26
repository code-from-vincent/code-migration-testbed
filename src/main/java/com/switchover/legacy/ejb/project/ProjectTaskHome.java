package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ProjectTaskHome extends EJBHome {
    ProjectTask create() throws CreateException, RemoteException;
}