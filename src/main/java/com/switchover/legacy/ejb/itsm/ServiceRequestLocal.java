package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ServiceRequestLocal extends EJBLocalObject {
    HashMap insertServiceRequest(DefaultParameters param) throws DefaultEJBException;
    Collection selectServiceRequestList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectServiceRequestDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateServiceRequest(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteServiceRequest(DefaultParameters param) throws DefaultEJBException;
}