package com.switchover.legacy.ejb.facility;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ReservationLocalHome extends EJBLocalHome {
    ReservationLocal create() throws CreateException;
}