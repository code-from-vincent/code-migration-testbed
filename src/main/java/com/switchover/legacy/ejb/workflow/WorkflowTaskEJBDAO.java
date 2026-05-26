package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class WorkflowTaskEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/workflow/170_workflowtask/WorkflowTask_SQL.xml";
    public HashMap insertWorkflowTask(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowTaskEJBDAO.InsertWorkflowTask", param);
    }
    public Collection selectWorkflowTaskList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "WorkflowTaskEJBDAO.SelectWorkflowTaskList", param);
    }
    public HashMap selectWorkflowTaskDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowTaskEJBDAO.SelectWorkflowTaskDetail", param);
    }
    public HashMap updateWorkflowTask(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowTaskEJBDAO.UpdateWorkflowTask", param);
    }
    public HashMap deleteWorkflowTask(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkflowTaskEJBDAO.DeleteWorkflowTask", param);
    }
}