package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PolicyClaimEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/healthcare/137_policyclaim/PolicyClaim_SQL.xml";
    public HashMap insertPolicyClaim(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PolicyClaimEJBDAO.InsertPolicyClaim", param);
    }
    public Collection selectPolicyClaimList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PolicyClaimEJBDAO.SelectPolicyClaimList", param);
    }
    public HashMap selectPolicyClaimDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PolicyClaimEJBDAO.SelectPolicyClaimDetail", param);
    }
    public HashMap updatePolicyClaim(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PolicyClaimEJBDAO.UpdatePolicyClaim", param);
    }
    public HashMap deletePolicyClaim(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PolicyClaimEJBDAO.DeletePolicyClaim", param);
    }
}