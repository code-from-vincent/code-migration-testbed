package com.switchover.legacy.ejb.facility;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SeatAllocationHome extends EJBHome {
    SeatAllocation create() throws CreateException, RemoteException;
}