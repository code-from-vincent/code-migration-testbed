package com.switchover.legacy.ejb.governance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ScenarioPlanHome extends EJBHome {
    ScenarioPlan create() throws CreateException, RemoteException;
}