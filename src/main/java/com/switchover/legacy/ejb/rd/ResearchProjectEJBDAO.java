package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ResearchProjectEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/rd/127_researchproject/ResearchProject_SQL.xml";
    public HashMap insertResearchProject(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ResearchProjectEJBDAO.InsertResearchProject", param);
    }
    public Collection selectResearchProjectList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ResearchProjectEJBDAO.SelectResearchProjectList", param);
    }
    public HashMap selectResearchProjectDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ResearchProjectEJBDAO.SelectResearchProjectDetail", param);
    }
    public HashMap updateResearchProject(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ResearchProjectEJBDAO.UpdateResearchProject", param);
    }
    public HashMap deleteResearchProject(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ResearchProjectEJBDAO.DeleteResearchProject", param);
    }
}