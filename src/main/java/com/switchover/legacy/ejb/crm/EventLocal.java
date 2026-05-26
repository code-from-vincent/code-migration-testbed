package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface EventLocal extends EJBLocalObject {
    HashMap insertEvent(DefaultParameters param) throws DefaultEJBException;
    Collection selectEventList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectEventDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateEvent(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteEvent(DefaultParameters param) throws DefaultEJBException;
}