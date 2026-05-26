package com.switchover.legacy.ejb.system;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface HolidayCalendar extends EJBObject {
    HashMap insertHolidayCalendar(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectHolidayCalendarList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectHolidayCalendarDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateHolidayCalendar(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteHolidayCalendar(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
