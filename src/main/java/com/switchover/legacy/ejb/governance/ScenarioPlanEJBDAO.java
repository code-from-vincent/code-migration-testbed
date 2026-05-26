package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ScenarioPlanEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/governance/189_scenarioplan/ScenarioPlan_SQL.xml";
    public HashMap insertScenarioPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ScenarioPlanEJBDAO.InsertScenarioPlan", param);
    }
    public Collection selectScenarioPlanList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ScenarioPlanEJBDAO.SelectScenarioPlanList", param);
    }
    public HashMap selectScenarioPlanDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ScenarioPlanEJBDAO.SelectScenarioPlanDetail", param);
    }
    public HashMap updateScenarioPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ScenarioPlanEJBDAO.UpdateScenarioPlan", param);
    }
    public HashMap deleteScenarioPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ScenarioPlanEJBDAO.DeleteScenarioPlan", param);
    }
}