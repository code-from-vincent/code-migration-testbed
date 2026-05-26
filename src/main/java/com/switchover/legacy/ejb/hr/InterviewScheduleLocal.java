package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface InterviewScheduleLocal extends EJBLocalObject {
    HashMap insertInterviewSchedule(DefaultParameters param) throws DefaultEJBException;
    Collection selectInterviewScheduleList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectInterviewScheduleDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateInterviewSchedule(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteInterviewSchedule(DefaultParameters param) throws DefaultEJBException;
}