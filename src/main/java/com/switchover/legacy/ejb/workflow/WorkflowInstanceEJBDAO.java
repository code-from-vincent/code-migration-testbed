package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class WorkflowInstanceEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/workflow/169_workflowinstance/WorkflowInstance_SQL.xml";
    public HashMap insertWorkflowInstance(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowInstanceEJBDAO.InsertWorkflowInstance", param);
    }
    public Collection selectWorkflowInstanceList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "WorkflowInstanceEJBDAO.SelectWorkflowInstanceList", param);
    }
    public HashMap selectWorkflowInstanceDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowInstanceEJBDAO.SelectWorkflowInstanceDetail", param);
    }
    public HashMap updateWorkflowInstance(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowInstanceEJBDAO.UpdateWorkflowInstance", param);
    }
    public HashMap deleteWorkflowInstance(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowInstanceEJBDAO.DeleteWorkflowInstance", param);
    }
}