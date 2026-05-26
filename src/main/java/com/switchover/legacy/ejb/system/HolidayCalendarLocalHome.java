package com.switchover.legacy.ejb.system;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface HolidayCalendarLocalHome extends EJBLocalHome {
    HolidayCalendarLocal create() throws CreateException;
}