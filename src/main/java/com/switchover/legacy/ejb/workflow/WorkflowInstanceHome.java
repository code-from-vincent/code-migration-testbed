package com.switchover.legacy.ejb.workflow;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface WorkflowInstanceHome extends EJBHome {
    WorkflowInstance create() throws CreateException, RemoteException;
}