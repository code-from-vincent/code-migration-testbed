package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CapacityPlanEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/infra/160_capacityplan/CapacityPlan_SQL.xml";
    public HashMap insertCapacityPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CapacityPlanEJBDAO.InsertCapacityPlan", param);
    }
    public Collection selectCapacityPlanList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CapacityPlanEJBDAO.SelectCapacityPlanList", param);
    }
    public HashMap selectCapacityPlanDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CapacityPlanEJBDAO.SelectCapacityPlanDetail", param);
    }
    public HashMap updateCapacityPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CapacityPlanEJBDAO.UpdateCapacityPlan", param);
    }
    public HashMap deleteCapacityPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CapacityPlanEJBDAO.DeleteCapacityPlan", param);
    }
}