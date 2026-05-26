package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class UserRoleEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/system/002_userrole/UserRole_SQL.xml";
    public HashMap insertUserRole(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserRoleEJBDAO.InsertUserRole", param);
    }
    public Collection selectUserRoleList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "UserRoleEJBDAO.SelectUserRoleList", param);
    }
    public HashMap selectUserRoleDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserRoleEJBDAO.SelectUserRoleDetail", param);
    }
    public HashMap updateUserRole(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserRoleEJBDAO.UpdateUserRole", param);
    }
    public HashMap deleteUserRole(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "UserRoleEJBDAO.DeleteUserRole", param);
    }
}