package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class HolidayCalendarEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/system/085_holidaycalendar/HolidayCalendar_SQL.xml";
    public HashMap insertHolidayCalendar(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "HolidayCalendarEJBDAO.InsertHolidayCalendar", param);
    }
    public Collection selectHolidayCalendarList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "HolidayCalendarEJBDAO.SelectHolidayCalendarList", param);
    }
    public HashMap selectHolidayCalendarDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "HolidayCalendarEJBDAO.SelectHolidayCalendarDetail", param);
    }
    public HashMap updateHolidayCalendar(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "HolidayCalendarEJBDAO.UpdateHolidayCalendar", param);
    }
    public HashMap deleteHolidayCalendar(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "HolidayCalendarEJBDAO.DeleteHolidayCalendar", param);
    }
}