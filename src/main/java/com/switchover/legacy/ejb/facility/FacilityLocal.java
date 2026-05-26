package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface FacilityLocal extends EJBLocalObject {
    HashMap insertFacility(DefaultParameters param) throws DefaultEJBException;
    Collection selectFacilityList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectFacilityDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateFacility(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteFacility(DefaultParameters param) throws DefaultEJBException;
}