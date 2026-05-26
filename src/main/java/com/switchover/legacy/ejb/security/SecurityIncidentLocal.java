package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SecurityIncidentLocal extends EJBLocalObject {
    HashMap insertSecurityIncident(DefaultParameters param) throws DefaultEJBException;
    Collection selectSecurityIncidentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSecurityIncidentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSecurityIncident(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSecurityIncident(DefaultParameters param) throws DefaultEJBException;
}