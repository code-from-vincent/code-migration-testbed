package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class IntegrationMessageEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/infra/083_integrationmessage/IntegrationMessage_SQL.xml";
    public HashMap insertIntegrationMessage(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IntegrationMessageEJBDAO.InsertIntegrationMessage", param);
    }
    public Collection selectIntegrationMessageList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "IntegrationMessageEJBDAO.SelectIntegrationMessageList", param);
    }
    public HashMap selectIntegrationMessageDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IntegrationMessageEJBDAO.SelectIntegrationMessageDetail", param);
    }
    public HashMap updateIntegrationMessage(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IntegrationMessageEJBDAO.UpdateIntegrationMessage", param);
    }
    public HashMap deleteIntegrationMessage(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IntegrationMessageEJBDAO.DeleteIntegrationMessage", param);
    }
}