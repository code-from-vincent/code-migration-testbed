package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CallRecordLocal extends EJBLocalObject {
    HashMap insertCallRecord(DefaultParameters param) throws DefaultEJBException;
    Collection selectCallRecordList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCallRecordDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCallRecord(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCallRecord(DefaultParameters param) throws DefaultEJBException;
}