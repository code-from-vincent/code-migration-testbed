package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface LabResultLocal extends EJBLocalObject {
    HashMap insertLabResult(DefaultParameters param) throws DefaultEJBException;
    Collection selectLabResultList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectLabResultDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateLabResult(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteLabResult(DefaultParameters param) throws DefaultEJBException;
}