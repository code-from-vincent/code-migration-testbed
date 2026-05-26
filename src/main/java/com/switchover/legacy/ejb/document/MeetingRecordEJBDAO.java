package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class MeetingRecordEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/document/060_meetingrecord/MeetingRecord_SQL.xml";
    public HashMap insertMeetingRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MeetingRecordEJBDAO.InsertMeetingRecord", param);
    }
    public Collection selectMeetingRecordList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "MeetingRecordEJBDAO.SelectMeetingRecordList", param);
    }
    public HashMap selectMeetingRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MeetingRecordEJBDAO.SelectMeetingRecordDetail", param);
    }
    public HashMap updateMeetingRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MeetingRecordEJBDAO.UpdateMeetingRecord", param);
    }
    public HashMap deleteMeetingRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MeetingRecordEJBDAO.DeleteMeetingRecord", param);
    }
}