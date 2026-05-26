package com.switchover.legacy.ejb.document;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface DocumentHome extends EJBHome {
    Document create() throws CreateException, RemoteException;
}