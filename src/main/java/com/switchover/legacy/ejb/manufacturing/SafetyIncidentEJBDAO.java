package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SafetyIncidentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/manufacturing/055_safetyincident/SafetyIncident_SQL.xml";
    public HashMap insertSafetyIncident(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SafetyIncidentEJBDAO.InsertSafetyIncident", param);
    }
    public Collection selectSafetyIncidentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SafetyIncidentEJBDAO.SelectSafetyIncidentList", param);
    }
    public HashMap selectSafetyIncidentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SafetyIncidentEJBDAO.SelectSafetyIncidentDetail", param);
    }
    public HashMap updateSafetyIncident(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SafetyIncidentEJBDAO.UpdateSafetyIncident", param);
    }
    public HashMap deleteSafetyIncident(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SafetyIncidentEJBDAO.DeleteSafetyIncident", param);
    }
}