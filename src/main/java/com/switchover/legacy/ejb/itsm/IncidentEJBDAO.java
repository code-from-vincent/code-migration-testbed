package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class IncidentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/itsm/163_incident/Incident_SQL.xml";
    public HashMap insertIncident(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IncidentEJBDAO.InsertIncident", param);
    }
    public Collection selectIncidentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "IncidentEJBDAO.SelectIncidentList", param);
    }
    public HashMap selectIncidentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IncidentEJBDAO.SelectIncidentDetail", param);
    }
    public HashMap updateIncident(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IncidentEJBDAO.UpdateIncident", param);
    }
    public HashMap deleteIncident(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IncidentEJBDAO.DeleteIncident", param);
    }
}