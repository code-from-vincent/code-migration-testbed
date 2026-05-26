package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ReleasePlanEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/project/148_releaseplan/ReleasePlan_SQL.xml";
    public HashMap insertReleasePlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReleasePlanEJBDAO.InsertReleasePlan", param);
    }
    public Collection selectReleasePlanList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ReleasePlanEJBDAO.SelectReleasePlanList", param);
    }
    public HashMap selectReleasePlanDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReleasePlanEJBDAO.SelectReleasePlanDetail", param);
    }
    public HashMap updateReleasePlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReleasePlanEJBDAO.UpdateReleasePlan", param);
    }
    public HashMap deleteReleasePlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReleasePlanEJBDAO.DeleteReleasePlan", param);
    }
}