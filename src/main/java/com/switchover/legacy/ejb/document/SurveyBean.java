package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SurveyBean extends DefaultSession {
    private final SurveyEJBDAO surveyEJBDAO = new SurveyEJBDAO();
    public HashMap insertSurvey(DefaultParameters param) throws DefaultEJBException {
        return surveyEJBDAO.insertSurvey(param);
    }
    public Collection selectSurveyList(DefaultParameters param) throws DefaultEJBException {
        return surveyEJBDAO.selectSurveyList(param);
    }
    public HashMap selectSurveyDetail(DefaultParameters param) throws DefaultEJBException {
        return surveyEJBDAO.selectSurveyDetail(param);
    }
    public HashMap updateSurvey(DefaultParameters param) throws DefaultEJBException {
        return surveyEJBDAO.updateSurvey(param);
    }
    public HashMap deleteSurvey(DefaultParameters param) throws DefaultEJBException {
        return surveyEJBDAO.deleteSurvey(param);
    }
}