package com.switchover.legacy.ejb.infra;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface BatchExecutionHistoryHome extends EJBHome {
    BatchExecutionHistory create() throws CreateException, RemoteException;
}