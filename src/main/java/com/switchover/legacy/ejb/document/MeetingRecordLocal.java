package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface MeetingRecordLocal extends EJBLocalObject {
    HashMap insertMeetingRecord(DefaultParameters param) throws DefaultEJBException;
    Collection selectMeetingRecordList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectMeetingRecordDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateMeetingRecord(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteMeetingRecord(DefaultParameters param) throws DefaultEJBException;
}