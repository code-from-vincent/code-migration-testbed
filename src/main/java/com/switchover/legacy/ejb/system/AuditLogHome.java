package com.switchover.legacy.ejb.system;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface AuditLogHome extends EJBHome {
    AuditLog create() throws CreateException, RemoteException;
}