package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ProjectTaskEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/project/006_projecttask/ProjectTask_SQL.xml";
    public HashMap insertProjectTask(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProjectTaskEJBDAO.InsertProjectTask", param);
    }
    public Collection selectProjectTaskList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ProjectTaskEJBDAO.SelectProjectTaskList", param);
    }
    public HashMap selectProjectTaskDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProjectTaskEJBDAO.SelectProjectTaskDetail", param);
    }
    public HashMap updateProjectTask(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProjectTaskEJBDAO.UpdateProjectTask", param);
    }
    public HashMap deleteProjectTask(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProjectTaskEJBDAO.DeleteProjectTask", param);
    }
}