package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ProjectTaskBean extends DefaultSession {
    private final ProjectTaskEJBDAO projectTaskEJBDAO = new ProjectTaskEJBDAO();
    public HashMap insertProjectTask(DefaultParameters param) throws DefaultEJBException {
        return projectTaskEJBDAO.insertProjectTask(param);
    }
    public Collection selectProjectTaskList(DefaultParameters param) throws DefaultEJBException {
        return projectTaskEJBDAO.selectProjectTaskList(param);
    }
    public HashMap selectProjectTaskDetail(DefaultParameters param) throws DefaultEJBException {
        return projectTaskEJBDAO.selectProjectTaskDetail(param);
    }
    public HashMap updateProjectTask(DefaultParameters param) throws DefaultEJBException {
        return projectTaskEJBDAO.updateProjectTask(param);
    }
    public HashMap deleteProjectTask(DefaultParameters param) throws DefaultEJBException {
        return projectTaskEJBDAO.deleteProjectTask(param);
    }
}