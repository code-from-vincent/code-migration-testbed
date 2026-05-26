package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface IncidentLocal extends EJBLocalObject {
    HashMap insertIncident(DefaultParameters param) throws DefaultEJBException;
    Collection selectIncidentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectIncidentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateIncident(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteIncident(DefaultParameters param) throws DefaultEJBException;
}