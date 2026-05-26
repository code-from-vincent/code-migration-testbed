package com.switchover.legacy.ejb.itsm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ConfigurationItemHome extends EJBHome {
    ConfigurationItem create() throws CreateException, RemoteException;
}