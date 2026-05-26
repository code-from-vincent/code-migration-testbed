package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SurveyResponseBean extends DefaultSession {
    private final SurveyResponseEJBDAO surveyResponseEJBDAO = new SurveyResponseEJBDAO();
    public HashMap insertSurveyResponse(DefaultParameters param) throws DefaultEJBException {
        return surveyResponseEJBDAO.insertSurveyResponse(param);
    }
    public Collection selectSurveyResponseList(DefaultParameters param) throws DefaultEJBException {
        return surveyResponseEJBDAO.selectSurveyResponseList(param);
    }
    public HashMap selectSurveyResponseDetail(DefaultParameters param) throws DefaultEJBException {
        return surveyResponseEJBDAO.selectSurveyResponseDetail(param);
    }
    public HashMap updateSurveyResponse(DefaultParameters param) throws DefaultEJBException {
        return surveyResponseEJBDAO.updateSurveyResponse(param);
    }
    public HashMap deleteSurveyResponse(DefaultParameters param) throws DefaultEJBException {
        return surveyResponseEJBDAO.deleteSurveyResponse(param);
    }
}