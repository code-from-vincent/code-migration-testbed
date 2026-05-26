package com.switchover.legacy.ejb.facility;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SeatAllocationLocalHome extends EJBLocalHome {
    SeatAllocationLocal create() throws CreateException;
}