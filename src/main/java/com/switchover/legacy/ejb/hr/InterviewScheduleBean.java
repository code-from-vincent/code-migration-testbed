package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class InterviewScheduleBean extends DefaultSession {
    private final InterviewScheduleEJBDAO interviewScheduleEJBDAO = new InterviewScheduleEJBDAO();
    public HashMap insertInterviewSchedule(DefaultParameters param) throws DefaultEJBException {
        return interviewScheduleEJBDAO.insertInterviewSchedule(param);
    }
    public Collection selectInterviewScheduleList(DefaultParameters param) throws DefaultEJBException {
        return interviewScheduleEJBDAO.selectInterviewScheduleList(param);
    }
    public HashMap selectInterviewScheduleDetail(DefaultParameters param) throws DefaultEJBException {
        return interviewScheduleEJBDAO.selectInterviewScheduleDetail(param);
    }
    public HashMap updateInterviewSchedule(DefaultParameters param) throws DefaultEJBException {
        return interviewScheduleEJBDAO.updateInterviewSchedule(param);
    }
    public HashMap deleteInterviewSchedule(DefaultParameters param) throws DefaultEJBException {
        return interviewScheduleEJBDAO.deleteInterviewSchedule(param);
    }
}