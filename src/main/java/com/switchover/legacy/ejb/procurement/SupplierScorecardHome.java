package com.switchover.legacy.ejb.procurement;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SupplierScorecardHome extends EJBHome {
    SupplierScorecard create() throws CreateException, RemoteException;
}