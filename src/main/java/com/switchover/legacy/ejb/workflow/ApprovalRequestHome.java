package com.switchover.legacy.ejb.workflow;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ApprovalRequestHome extends EJBHome {
    ApprovalRequest create() throws CreateException, RemoteException;
}