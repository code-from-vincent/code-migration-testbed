package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class EventEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/crm/095_event/Event_SQL.xml";
    public HashMap insertEvent(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EventEJBDAO.InsertEvent", param);
    }
    public Collection selectEventList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "EventEJBDAO.SelectEventList", param);
    }
    public HashMap selectEventDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EventEJBDAO.SelectEventDetail", param);
    }
    public HashMap updateEvent(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EventEJBDAO.UpdateEvent", param);
    }
    public HashMap deleteEvent(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EventEJBDAO.DeleteEvent", param);
    }
}