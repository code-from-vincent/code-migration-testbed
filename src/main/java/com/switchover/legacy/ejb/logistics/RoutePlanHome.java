package com.switchover.legacy.ejb.logistics;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RoutePlanHome extends EJBHome {
    RoutePlan create() throws CreateException, RemoteException;
}