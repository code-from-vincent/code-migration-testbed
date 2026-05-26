package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PrivacyRequestEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/privacy/178_privacyrequest/PrivacyRequest_SQL.xml";
    public HashMap insertPrivacyRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PrivacyRequestEJBDAO.InsertPrivacyRequest", param);
    }
    public Collection selectPrivacyRequestList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PrivacyRequestEJBDAO.SelectPrivacyRequestList", param);
    }
    public HashMap selectPrivacyRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PrivacyRequestEJBDAO.SelectPrivacyRequestDetail", param);
    }
    public HashMap updatePrivacyRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PrivacyRequestEJBDAO.UpdatePrivacyRequest", param);
    }
    public HashMap deletePrivacyRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PrivacyRequestEJBDAO.DeletePrivacyRequest", param);
    }
}