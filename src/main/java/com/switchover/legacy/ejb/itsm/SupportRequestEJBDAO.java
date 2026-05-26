package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SupportRequestEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/itsm/064_supportrequest/SupportRequest_SQL.xml";
    public HashMap insertSupportRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SupportRequestEJBDAO.InsertSupportRequest", param);
    }
    public Collection selectSupportRequestList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SupportRequestEJBDAO.SelectSupportRequestList", param);
    }
    public HashMap selectSupportRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SupportRequestEJBDAO.SelectSupportRequestDetail", param);
    }
    public HashMap updateSupportRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SupportRequestEJBDAO.UpdateSupportRequest", param);
    }
    public HashMap deleteSupportRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SupportRequestEJBDAO.DeleteSupportRequest", param);
    }
}