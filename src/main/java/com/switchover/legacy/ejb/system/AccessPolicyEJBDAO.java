package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class AccessPolicyEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/system/011_accesspolicy/AccessPolicy_SQL.xml";
    public HashMap insertAccessPolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccessPolicyEJBDAO.InsertAccessPolicy", param);
    }
    public Collection selectAccessPolicyList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "AccessPolicyEJBDAO.SelectAccessPolicyList", param);
    }
    public HashMap selectAccessPolicyDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccessPolicyEJBDAO.SelectAccessPolicyDetail", param);
    }
    public HashMap updateAccessPolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccessPolicyEJBDAO.UpdateAccessPolicy", param);
    }
    public HashMap deleteAccessPolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccessPolicyEJBDAO.DeleteAccessPolicy", param);
    }
}