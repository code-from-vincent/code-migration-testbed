package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class RiskAssessmentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/legal/057_riskassessment/RiskAssessment_SQL.xml";
    public HashMap insertRiskAssessment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RiskAssessmentEJBDAO.InsertRiskAssessment", param);
    }
    public Collection selectRiskAssessmentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "RiskAssessmentEJBDAO.SelectRiskAssessmentList", param);
    }
    public HashMap selectRiskAssessmentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RiskAssessmentEJBDAO.SelectRiskAssessmentDetail", param);
    }
    public HashMap updateRiskAssessment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RiskAssessmentEJBDAO.UpdateRiskAssessment", param);
    }
    public HashMap deleteRiskAssessment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RiskAssessmentEJBDAO.DeleteRiskAssessment", param);
    }
}