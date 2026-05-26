package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SecurityIncidentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/security/154_securityincident/SecurityIncident_SQL.xml";
    public HashMap insertSecurityIncident(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SecurityIncidentEJBDAO.InsertSecurityIncident", param);
    }
    public Collection selectSecurityIncidentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SecurityIncidentEJBDAO.SelectSecurityIncidentList", param);
    }
    public HashMap selectSecurityIncidentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SecurityIncidentEJBDAO.SelectSecurityIncidentDetail", param);
    }
    public HashMap updateSecurityIncident(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SecurityIncidentEJBDAO.UpdateSecurityIncident", param);
    }
    public HashMap deleteSecurityIncident(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SecurityIncidentEJBDAO.DeleteSecurityIncident", param);
    }
}