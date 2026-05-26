package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class MeetingRecordBean extends DefaultSession {
    private final MeetingRecordEJBDAO meetingRecordEJBDAO = new MeetingRecordEJBDAO();
    public HashMap insertMeetingRecord(DefaultParameters param) throws DefaultEJBException {
        return meetingRecordEJBDAO.insertMeetingRecord(param);
    }
    public Collection selectMeetingRecordList(DefaultParameters param) throws DefaultEJBException {
        return meetingRecordEJBDAO.selectMeetingRecordList(param);
    }
    public HashMap selectMeetingRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return meetingRecordEJBDAO.selectMeetingRecordDetail(param);
    }
    public HashMap updateMeetingRecord(DefaultParameters param) throws DefaultEJBException {
        return meetingRecordEJBDAO.updateMeetingRecord(param);
    }
    public HashMap deleteMeetingRecord(DefaultParameters param) throws DefaultEJBException {
        return meetingRecordEJBDAO.deleteMeetingRecord(param);
    }
}