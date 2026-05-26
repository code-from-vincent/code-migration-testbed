package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class EventBean extends DefaultSession {
    private final EventEJBDAO eventEJBDAO = new EventEJBDAO();
    public HashMap insertEvent(DefaultParameters param) throws DefaultEJBException {
        return eventEJBDAO.insertEvent(param);
    }
    public Collection selectEventList(DefaultParameters param) throws DefaultEJBException {
        return eventEJBDAO.selectEventList(param);
    }
    public HashMap selectEventDetail(DefaultParameters param) throws DefaultEJBException {
        return eventEJBDAO.selectEventDetail(param);
    }
    public HashMap updateEvent(DefaultParameters param) throws DefaultEJBException {
        return eventEJBDAO.updateEvent(param);
    }
    public HashMap deleteEvent(DefaultParameters param) throws DefaultEJBException {
        return eventEJBDAO.deleteEvent(param);
    }
}