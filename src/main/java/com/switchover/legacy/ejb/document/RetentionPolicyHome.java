package com.switchover.legacy.ejb.document;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RetentionPolicyHome extends EJBHome {
    RetentionPolicy create() throws CreateException, RemoteException;
}