package com.switchover.legacy.ejb.itsm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ServiceCatalogHome extends EJBHome {
    ServiceCatalog create() throws CreateException, RemoteException;
}