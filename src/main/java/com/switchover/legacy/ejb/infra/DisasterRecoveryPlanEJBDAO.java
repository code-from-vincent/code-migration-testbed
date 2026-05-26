package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DisasterRecoveryPlanEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/infra/159_disasterrecoveryplan/DisasterRecoveryPlan_SQL.xml";
    public HashMap insertDisasterRecoveryPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DisasterRecoveryPlanEJBDAO.InsertDisasterRecoveryPlan", param);
    }
    public Collection selectDisasterRecoveryPlanList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DisasterRecoveryPlanEJBDAO.SelectDisasterRecoveryPlanList", param);
    }
    public HashMap selectDisasterRecoveryPlanDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DisasterRecoveryPlanEJBDAO.SelectDisasterRecoveryPlanDetail", param);
    }
    public HashMap updateDisasterRecoveryPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DisasterRecoveryPlanEJBDAO.UpdateDisasterRecoveryPlan", param);
    }
    public HashMap deleteDisasterRecoveryPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DisasterRecoveryPlanEJBDAO.DeleteDisasterRecoveryPlan", param);
    }
}