package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PasswordPolicyEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/security/153_passwordpolicy/PasswordPolicy_SQL.xml";
    public HashMap insertPasswordPolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PasswordPolicyEJBDAO.InsertPasswordPolicy", param);
    }
    public Collection selectPasswordPolicyList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PasswordPolicyEJBDAO.SelectPasswordPolicyList", param);
    }
    public HashMap selectPasswordPolicyDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PasswordPolicyEJBDAO.SelectPasswordPolicyDetail", param);
    }
    public HashMap updatePasswordPolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PasswordPolicyEJBDAO.UpdatePasswordPolicy", param);
    }
    public HashMap deletePasswordPolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PasswordPolicyEJBDAO.DeletePasswordPolicy", param);
    }
}