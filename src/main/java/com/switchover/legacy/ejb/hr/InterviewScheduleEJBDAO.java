package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class InterviewScheduleEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/033_interviewschedule/InterviewSchedule_SQL.xml";
    public HashMap insertInterviewSchedule(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InterviewScheduleEJBDAO.InsertInterviewSchedule", param);
    }
    public Collection selectInterviewScheduleList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "InterviewScheduleEJBDAO.SelectInterviewScheduleList", param);
    }
    public HashMap selectInterviewScheduleDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InterviewScheduleEJBDAO.SelectInterviewScheduleDetail", param);
    }
    public HashMap updateInterviewSchedule(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InterviewScheduleEJBDAO.UpdateInterviewSchedule", param);
    }
    public HashMap deleteInterviewSchedule(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InterviewScheduleEJBDAO.DeleteInterviewSchedule", param);
    }
}