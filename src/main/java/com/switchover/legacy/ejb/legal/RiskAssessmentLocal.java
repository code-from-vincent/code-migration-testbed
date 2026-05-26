package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface RiskAssessmentLocal extends EJBLocalObject {
    HashMap insertRiskAssessment(DefaultParameters param) throws DefaultEJBException;
    Collection selectRiskAssessmentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectRiskAssessmentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateRiskAssessment(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteRiskAssessment(DefaultParameters param) throws DefaultEJBException;
}