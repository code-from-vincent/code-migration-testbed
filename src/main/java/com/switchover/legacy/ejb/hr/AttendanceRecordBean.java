package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class AttendanceRecordBean extends DefaultSession {
    private final AttendanceRecordEJBDAO attendanceRecordEJBDAO = new AttendanceRecordEJBDAO();
    public HashMap insertAttendanceRecord(DefaultParameters param) throws DefaultEJBException {
        return attendanceRecordEJBDAO.insertAttendanceRecord(param);
    }
    public Collection selectAttendanceRecordList(DefaultParameters param) throws DefaultEJBException {
        return attendanceRecordEJBDAO.selectAttendanceRecordList(param);
    }
    public HashMap selectAttendanceRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return attendanceRecordEJBDAO.selectAttendanceRecordDetail(param);
    }
    public HashMap updateAttendanceRecord(DefaultParameters param) throws DefaultEJBException {
        return attendanceRecordEJBDAO.updateAttendanceRecord(param);
    }
    public HashMap deleteAttendanceRecord(DefaultParameters param) throws DefaultEJBException {
        return attendanceRecordEJBDAO.deleteAttendanceRecord(param);
    }
}