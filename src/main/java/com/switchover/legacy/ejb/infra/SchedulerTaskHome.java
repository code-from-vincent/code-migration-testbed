package com.switchover.legacy.ejb.infra;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SchedulerTaskHome extends EJBHome {
    SchedulerTask create() throws CreateException, RemoteException;
}