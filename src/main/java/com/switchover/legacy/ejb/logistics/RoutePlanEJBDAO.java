package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class RoutePlanEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/logistics/103_routeplan/RoutePlan_SQL.xml";
    public HashMap insertRoutePlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RoutePlanEJBDAO.InsertRoutePlan", param);
    }
    public Collection selectRoutePlanList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "RoutePlanEJBDAO.SelectRoutePlanList", param);
    }
    public HashMap selectRoutePlanDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RoutePlanEJBDAO.SelectRoutePlanDetail", param);
    }
    public HashMap updateRoutePlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RoutePlanEJBDAO.UpdateRoutePlan", param);
    }
    public HashMap deleteRoutePlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RoutePlanEJBDAO.DeleteRoutePlan", param);
    }
}