package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ServiceRequestEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/itsm/162_servicerequest/ServiceRequest_SQL.xml";
    public HashMap insertServiceRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceRequestEJBDAO.InsertServiceRequest", param);
    }
    public Collection selectServiceRequestList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ServiceRequestEJBDAO.SelectServiceRequestList", param);
    }
    public HashMap selectServiceRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceRequestEJBDAO.SelectServiceRequestDetail", param);
    }
    public HashMap updateServiceRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceRequestEJBDAO.UpdateServiceRequest", param);
    }
    public HashMap deleteServiceRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceRequestEJBDAO.DeleteServiceRequest", param);
    }
}