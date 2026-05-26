package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class UserSessionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/security/151_usersession/UserSession_SQL.xml";
    public HashMap insertUserSession(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserSessionEJBDAO.InsertUserSession", param);
    }
    public Collection selectUserSessionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "UserSessionEJBDAO.SelectUserSessionList", param);
    }
    public HashMap selectUserSessionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserSessionEJBDAO.SelectUserSessionDetail", param);
    }
    public HashMap updateUserSession(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserSessionEJBDAO.UpdateUserSession", param);
    }
    public HashMap deleteUserSession(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserSessionEJBDAO.DeleteUserSession", param);
    }
}