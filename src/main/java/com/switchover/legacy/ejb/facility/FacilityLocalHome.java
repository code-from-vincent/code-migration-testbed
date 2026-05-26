package com.switchover.legacy.ejb.facility;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface FacilityLocalHome extends EJBLocalHome {
    FacilityLocal create() throws CreateException;
}