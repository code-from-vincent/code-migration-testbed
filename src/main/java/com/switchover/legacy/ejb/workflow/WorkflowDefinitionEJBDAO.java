package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class WorkflowDefinitionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/workflow/168_workflowdefinition/WorkflowDefinition_SQL.xml";
    public HashMap insertWorkflowDefinition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowDefinitionEJBDAO.InsertWorkflowDefinition", param);
    }
    public Collection selectWorkflowDefinitionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "WorkflowDefinitionEJBDAO.SelectWorkflowDefinitionList", param);
    }
    public HashMap selectWorkflowDefinitionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowDefinitionEJBDAO.SelectWorkflowDefinitionDetail", param);
    }
    public HashMap updateWorkflowDefinition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowDefinitionEJBDAO.UpdateWorkflowDefinition", param);
    }
    public HashMap deleteWorkflowDefinition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowDefinitionEJBDAO.DeleteWorkflowDefinition", param);
    }
}