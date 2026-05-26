package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class InsurancePolicyEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/healthcare/136_insurancepolicy/InsurancePolicy_SQL.xml";
    public HashMap insertInsurancePolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InsurancePolicyEJBDAO.InsertInsurancePolicy", param);
    }
    public Collection selectInsurancePolicyList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "InsurancePolicyEJBDAO.SelectInsurancePolicyList", param);
    }
    public HashMap selectInsurancePolicyDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InsurancePolicyEJBDAO.SelectInsurancePolicyDetail", param);
    }
    public HashMap updateInsurancePolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InsurancePolicyEJBDAO.UpdateInsurancePolicy", param);
    }
    public HashMap deleteInsurancePolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InsurancePolicyEJBDAO.DeleteInsurancePolicy", param);
    }
}