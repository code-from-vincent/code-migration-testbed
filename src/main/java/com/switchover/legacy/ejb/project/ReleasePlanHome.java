package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ReleasePlanHome extends EJBHome {
    ReleasePlan create() throws CreateException, RemoteException;
}