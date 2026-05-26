package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SchedulerTaskBean extends DefaultSession {
    private final SchedulerTaskEJBDAO schedulerTaskEJBDAO = new SchedulerTaskEJBDAO();
    public HashMap insertSchedulerTask(DefaultParameters param) throws DefaultEJBException {
        return schedulerTaskEJBDAO.insertSchedulerTask(param);
    }
    public Collection selectSchedulerTaskList(DefaultParameters param) throws DefaultEJBException {
        return schedulerTaskEJBDAO.selectSchedulerTaskList(param);
    }
    public HashMap selectSchedulerTaskDetail(DefaultParameters param) throws DefaultEJBException {
        return schedulerTaskEJBDAO.selectSchedulerTaskDetail(param);
    }
    public HashMap updateSchedulerTask(DefaultParameters param) throws DefaultEJBException {
        return schedulerTaskEJBDAO.updateSchedulerTask(param);
    }
    public HashMap deleteSchedulerTask(DefaultParameters param) throws DefaultEJBException {
        return schedulerTaskEJBDAO.deleteSchedulerTask(param);
    }
}