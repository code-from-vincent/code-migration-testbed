package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class LoginHistoryEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/security/152_loginhistory/LoginHistory_SQL.xml";
    public HashMap insertLoginHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoginHistoryEJBDAO.InsertLoginHistory", param);
    }
    public Collection selectLoginHistoryList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "LoginHistoryEJBDAO.SelectLoginHistoryList", param);
    }
    public HashMap selectLoginHistoryDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoginHistoryEJBDAO.SelectLoginHistoryDetail", param);
    }
    public HashMap updateLoginHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoginHistoryEJBDAO.UpdateLoginHistory", param);
    }
    public HashMap deleteLoginHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoginHistoryEJBDAO.DeleteLoginHistory", param);
    }
}