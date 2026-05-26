package com.switchover.legacy.ejb.system;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface HolidayCalendarHome extends EJBHome {
    HolidayCalendar create() throws CreateException, RemoteException;
}