package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ActionItemHome extends EJBHome {
    ActionItem create() throws CreateException, RemoteException;
}