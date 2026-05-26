package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class UserAccountEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/system/001_useraccount/UserAccount_SQL.xml";
    public HashMap insertUserAccount(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserAccountEJBDAO.InsertUserAccount", param);
    }
    public Collection selectUserAccountList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "UserAccountEJBDAO.SelectUserAccountList", param);
    }
    public HashMap selectUserAccountDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserAccountEJBDAO.SelectUserAccountDetail", param);
    }
    public HashMap updateUserAccount(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserAccountEJBDAO.UpdateUserAccount", param);
    }
    public HashMap deleteUserAccount(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserAccountEJBDAO.DeleteUserAccount", param);
    }
}