package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ApiClientEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/infra/067_apiclient/ApiClient_SQL.xml";
    public HashMap insertApiClient(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApiClientEJBDAO.InsertApiClient", param);
    }
    public Collection selectApiClientList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ApiClientEJBDAO.SelectApiClientList", param);
    }
    public HashMap selectApiClientDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApiClientEJBDAO.SelectApiClientDetail", param);
    }
    public HashMap updateApiClient(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApiClientEJBDAO.UpdateApiClient", param);
    }
    public HashMap deleteApiClient(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApiClientEJBDAO.DeleteApiClient", param);
    }
}