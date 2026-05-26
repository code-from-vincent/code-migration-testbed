package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface AttendanceRecordLocal extends EJBLocalObject {
    HashMap insertAttendanceRecord(DefaultParameters param) throws DefaultEJBException;
    Collection selectAttendanceRecordList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectAttendanceRecordDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateAttendanceRecord(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteAttendanceRecord(DefaultParameters param) throws DefaultEJBException;
}