package com.switchover.legacy.ejb.facility;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ReservationHome extends EJBHome {
    Reservation create() throws CreateException, RemoteException;
}