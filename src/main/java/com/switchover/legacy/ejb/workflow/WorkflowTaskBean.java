package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class WorkflowTaskBean extends DefaultSession {
    private final WorkflowTaskEJBDAO workflowTaskEJBDAO = new WorkflowTaskEJBDAO();
    public HashMap insertWorkflowTask(DefaultParameters param) throws DefaultEJBException {
        return workflowTaskEJBDAO.insertWorkflowTask(param);
    }
    public Collection selectWorkflowTaskList(DefaultParameters param) throws DefaultEJBException {
        return workflowTaskEJBDAO.selectWorkflowTaskList(param);
    }
    public HashMap selectWorkflowTaskDetail(DefaultParameters param) throws DefaultEJBException {
        return workflowTaskEJBDAO.selectWorkflowTaskDetail(param);
    }
    public HashMap updateWorkflowTask(DefaultParameters param) throws DefaultEJBException {
        return workflowTaskEJBDAO.updateWorkflowTask(param);
    }
    public HashMap deleteWorkflowTask(DefaultParameters param) throws DefaultEJBException {
        return workflowTaskEJBDAO.deleteWorkflowTask(param);
    }
}