package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class RetentionPolicyEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/document/175_retentionpolicy/RetentionPolicy_SQL.xml";
    public HashMap insertRetentionPolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RetentionPolicyEJBDAO.InsertRetentionPolicy", param);
    }
    public Collection selectRetentionPolicyList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "RetentionPolicyEJBDAO.SelectRetentionPolicyList", param);
    }
    public HashMap selectRetentionPolicyDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RetentionPolicyEJBDAO.SelectRetentionPolicyDetail", param);
    }
    public HashMap updateRetentionPolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RetentionPolicyEJBDAO.UpdateRetentionPolicy", param);
    }
    public HashMap deleteRetentionPolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RetentionPolicyEJBDAO.DeleteRetentionPolicy", param);
    }
}