package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SurveyEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/document/062_survey/Survey_SQL.xml";
    public HashMap insertSurvey(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SurveyEJBDAO.InsertSurvey", param);
    }
    public Collection selectSurveyList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SurveyEJBDAO.SelectSurveyList", param);
    }
    public HashMap selectSurveyDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SurveyEJBDAO.SelectSurveyDetail", param);
    }
    public HashMap updateSurvey(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SurveyEJBDAO.UpdateSurvey", param);
    }
    public HashMap deleteSurvey(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SurveyEJBDAO.DeleteSurvey", param);
    }
}