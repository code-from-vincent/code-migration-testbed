package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface HolidayCalendarLocal extends EJBLocalObject {
    HashMap insertHolidayCalendar(DefaultParameters param) throws DefaultEJBException;
    Collection selectHolidayCalendarList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectHolidayCalendarDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateHolidayCalendar(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteHolidayCalendar(DefaultParameters param) throws DefaultEJBException;
}