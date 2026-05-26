package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ProjectEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/project/005_project/Project_SQL.xml";
    public HashMap insertProject(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProjectEJBDAO.InsertProject", param);
    }
    public Collection selectProjectList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ProjectEJBDAO.SelectProjectList", param);
    }
    public HashMap selectProjectDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProjectEJBDAO.SelectProjectDetail", param);
    }
    public HashMap updateProject(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProjectEJBDAO.UpdateProject", param);
    }
    public HashMap deleteProject(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProjectEJBDAO.DeleteProject", param);
    }
}