package com.switchover.legacy.ejb.legal;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ComplianceCheckHome extends EJBHome {
    ComplianceCheck create() throws CreateException, RemoteException;
}