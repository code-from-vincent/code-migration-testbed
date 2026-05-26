package com.switchover.legacy.ejb.document;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface DocumentApprovalHome extends EJBHome {
    DocumentApproval create() throws CreateException, RemoteException;
}