package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ChangeRequestHome extends EJBHome {
    ChangeRequest create() throws CreateException, RemoteException;
}