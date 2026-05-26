package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class WorkflowInstanceBean extends DefaultSession {
    private final WorkflowInstanceEJBDAO workflowInstanceEJBDAO = new WorkflowInstanceEJBDAO();
    public HashMap insertWorkflowInstance(DefaultParameters param) throws DefaultEJBException {
        return workflowInstanceEJBDAO.insertWorkflowInstance(param);
    }
    public Collection selectWorkflowInstanceList(DefaultParameters param) throws DefaultEJBException {
        return workflowInstanceEJBDAO.selectWorkflowInstanceList(param);
    }
    public HashMap selectWorkflowInstanceDetail(DefaultParameters param) throws DefaultEJBException {
        return workflowInstanceEJBDAO.selectWorkflowInstanceDetail(param);
    }
    public HashMap updateWorkflowInstance(DefaultParameters param) throws DefaultEJBException {
        return workflowInstanceEJBDAO.updateWorkflowInstance(param);
    }
    public HashMap deleteWorkflowInstance(DefaultParameters param) throws DefaultEJBException {
        return workflowInstanceEJBDAO.deleteWorkflowInstance(param);
    }
}