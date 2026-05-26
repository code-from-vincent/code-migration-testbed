package com.switchover.legacy.ejb.manufacturing;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface BillOfMaterialHome extends EJBHome {
    BillOfMaterial create() throws CreateException, RemoteException;
}