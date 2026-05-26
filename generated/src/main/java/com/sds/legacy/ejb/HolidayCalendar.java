package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface HolidayCalendar extends DefaultSession {
    HashMap insertHolidayCalendar(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectHolidayCalendarList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectHolidayCalendarDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateHolidayCalendar(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteHolidayCalendar(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
