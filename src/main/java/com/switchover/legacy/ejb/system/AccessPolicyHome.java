package com.switchover.legacy.ejb.system;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface AccessPolicyHome extends EJBHome {
    AccessPolicy create() throws CreateException, RemoteException;
}