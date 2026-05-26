package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SchedulerTaskLocal extends EJBLocalObject {
    HashMap insertSchedulerTask(DefaultParameters param) throws DefaultEJBException;
    Collection selectSchedulerTaskList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSchedulerTaskDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSchedulerTask(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSchedulerTask(DefaultParameters param) throws DefaultEJBException;
}