package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class RiskAssessmentBean extends DefaultSession {
    private final RiskAssessmentEJBDAO riskAssessmentEJBDAO = new RiskAssessmentEJBDAO();
    public HashMap insertRiskAssessment(DefaultParameters param) throws DefaultEJBException {
        return riskAssessmentEJBDAO.insertRiskAssessment(param);
    }
    public Collection selectRiskAssessmentList(DefaultParameters param) throws DefaultEJBException {
        return riskAssessmentEJBDAO.selectRiskAssessmentList(param);
    }
    public HashMap selectRiskAssessmentDetail(DefaultParameters param) throws DefaultEJBException {
        return riskAssessmentEJBDAO.selectRiskAssessmentDetail(param);
    }
    public HashMap updateRiskAssessment(DefaultParameters param) throws DefaultEJBException {
        return riskAssessmentEJBDAO.updateRiskAssessment(param);
    }
    public HashMap deleteRiskAssessment(DefaultParameters param) throws DefaultEJBException {
        return riskAssessmentEJBDAO.deleteRiskAssessment(param);
    }
}