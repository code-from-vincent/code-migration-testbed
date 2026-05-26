package com.switchover.legacy.ejb.facility;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface FacilityBookingHome extends EJBHome {
    FacilityBooking create() throws CreateException, RemoteException;
}