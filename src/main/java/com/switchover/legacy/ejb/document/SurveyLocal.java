package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SurveyLocal extends EJBLocalObject {
    HashMap insertSurvey(DefaultParameters param) throws DefaultEJBException;
    Collection selectSurveyList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSurveyDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSurvey(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSurvey(DefaultParameters param) throws DefaultEJBException;
}