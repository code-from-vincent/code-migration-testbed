package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class IntegrationEndpointEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/infra/082_integrationendpoint/IntegrationEndpoint_SQL.xml";
    public HashMap insertIntegrationEndpoint(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IntegrationEndpointEJBDAO.InsertIntegrationEndpoint", param);
    }
    public Collection selectIntegrationEndpointList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "IntegrationEndpointEJBDAO.SelectIntegrationEndpointList", param);
    }
    public HashMap selectIntegrationEndpointDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IntegrationEndpointEJBDAO.SelectIntegrationEndpointDetail", param);
    }
    public HashMap updateIntegrationEndpoint(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IntegrationEndpointEJBDAO.UpdateIntegrationEndpoint", param);
    }
    public HashMap deleteIntegrationEndpoint(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IntegrationEndpointEJBDAO.DeleteIntegrationEndpoint", param);
    }
}