package com.switchover.legacy.ejb.facility;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface VehicleReservationLocalHome extends EJBLocalHome {
    VehicleReservationLocal create() throws CreateException;
}