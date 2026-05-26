package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class WorkflowDefinitionBean extends DefaultSession {
    private final WorkflowDefinitionEJBDAO workflowDefinitionEJBDAO = new WorkflowDefinitionEJBDAO();
    public HashMap insertWorkflowDefinition(DefaultParameters param) throws DefaultEJBException {
        return workflowDefinitionEJBDAO.insertWorkflowDefinition(param);
    }
    public Collection selectWorkflowDefinitionList(DefaultParameters param) throws DefaultEJBException {
        return workflowDefinitionEJBDAO.selectWorkflowDefinitionList(param);
    }
    public HashMap selectWorkflowDefinitionDetail(DefaultParameters param) throws DefaultEJBException {
        return workflowDefinitionEJBDAO.selectWorkflowDefinitionDetail(param);
    }
    public HashMap updateWorkflowDefinition(DefaultParameters param) throws DefaultEJBException {
        return workflowDefinitionEJBDAO.updateWorkflowDefinition(param);
    }
    public HashMap deleteWorkflowDefinition(DefaultParameters param) throws DefaultEJBException {
        return workflowDefinitionEJBDAO.deleteWorkflowDefinition(param);
    }
}