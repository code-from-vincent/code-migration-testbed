package com.switchover.legacy.ejb.procurement;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ProcurementBidHome extends EJBHome {
    ProcurementBid create() throws CreateException, RemoteException;
}