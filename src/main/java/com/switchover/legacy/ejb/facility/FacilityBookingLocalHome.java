package com.switchover.legacy.ejb.facility;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface FacilityBookingLocalHome extends EJBLocalHome {
    FacilityBookingLocal create() throws CreateException;
}