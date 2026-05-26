package com.switchover.legacy.ejb.procurement;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ProcurementCatalogHome extends EJBHome {
    ProcurementCatalog create() throws CreateException, RemoteException;
}