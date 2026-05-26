package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class HolidayCalendarBean extends DefaultSession {
    private final HolidayCalendarEJBDAO holidayCalendarEJBDAO = new HolidayCalendarEJBDAO();
    public HashMap insertHolidayCalendar(DefaultParameters param) throws DefaultEJBException {
        return holidayCalendarEJBDAO.insertHolidayCalendar(param);
    }
    public Collection selectHolidayCalendarList(DefaultParameters param) throws DefaultEJBException {
        return holidayCalendarEJBDAO.selectHolidayCalendarList(param);
    }
    public HashMap selectHolidayCalendarDetail(DefaultParameters param) throws DefaultEJBException {
        return holidayCalendarEJBDAO.selectHolidayCalendarDetail(param);
    }
    public HashMap updateHolidayCalendar(DefaultParameters param) throws DefaultEJBException {
        return holidayCalendarEJBDAO.updateHolidayCalendar(param);
    }
    public HashMap deleteHolidayCalendar(DefaultParameters param) throws DefaultEJBException {
        return holidayCalendarEJBDAO.deleteHolidayCalendar(param);
    }
}