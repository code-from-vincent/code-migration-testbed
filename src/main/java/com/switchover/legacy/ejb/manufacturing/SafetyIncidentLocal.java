package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SafetyIncidentLocal extends EJBLocalObject {
    HashMap insertSafetyIncident(DefaultParameters param) throws DefaultEJBException;
    Collection selectSafetyIncidentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSafetyIncidentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSafetyIncident(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSafetyIncident(DefaultParameters param) throws DefaultEJBException;
}