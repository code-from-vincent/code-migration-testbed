package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class StrategicInitiativeEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/governance/185_strategicinitiative/StrategicInitiative_SQL.xml";
    public HashMap insertStrategicInitiative(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StrategicInitiativeEJBDAO.InsertStrategicInitiative", param);
    }
    public Collection selectStrategicInitiativeList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "StrategicInitiativeEJBDAO.SelectStrategicInitiativeList", param);
    }
    public HashMap selectStrategicInitiativeDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StrategicInitiativeEJBDAO.SelectStrategicInitiativeDetail", param);
    }
    public HashMap updateStrategicInitiative(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StrategicInitiativeEJBDAO.UpdateStrategicInitiative", param);
    }
    public HashMap deleteStrategicInitiative(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StrategicInitiativeEJBDAO.DeleteStrategicInitiative", param);
    }
}