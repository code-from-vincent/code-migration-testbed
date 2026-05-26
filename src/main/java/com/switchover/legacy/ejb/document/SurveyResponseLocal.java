package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SurveyResponseLocal extends EJBLocalObject {
    HashMap insertSurveyResponse(DefaultParameters param) throws DefaultEJBException;
    Collection selectSurveyResponseList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSurveyResponseDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSurveyResponse(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSurveyResponse(DefaultParameters param) throws DefaultEJBException;
}