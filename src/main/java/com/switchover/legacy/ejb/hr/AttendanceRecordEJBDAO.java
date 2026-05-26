package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class AttendanceRecordEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/028_attendancerecord/AttendanceRecord_SQL.xml";
    public HashMap insertAttendanceRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AttendanceRecordEJBDAO.InsertAttendanceRecord", param);
    }
    public Collection selectAttendanceRecordList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "AttendanceRecordEJBDAO.SelectAttendanceRecordList", param);
    }
    public HashMap selectAttendanceRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AttendanceRecordEJBDAO.SelectAttendanceRecordDetail", param);
    }
    public HashMap updateAttendanceRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AttendanceRecordEJBDAO.UpdateAttendanceRecord", param);
    }
    public HashMap deleteAttendanceRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AttendanceRecordEJBDAO.DeleteAttendanceRecord", param);
    }
}