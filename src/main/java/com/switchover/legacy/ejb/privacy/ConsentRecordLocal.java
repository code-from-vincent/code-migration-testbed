package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ConsentRecordLocal extends EJBLocalObject {
    HashMap insertConsentRecord(DefaultParameters param) throws DefaultEJBException;
    Collection selectConsentRecordList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectConsentRecordDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateConsentRecord(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteConsentRecord(DefaultParameters param) throws DefaultEJBException;
}