package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SurveyResponseEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/document/063_surveyresponse/SurveyResponse_SQL.xml";
    public HashMap insertSurveyResponse(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SurveyResponseEJBDAO.InsertSurveyResponse", param);
    }
    public Collection selectSurveyResponseList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SurveyResponseEJBDAO.SelectSurveyResponseList", param);
    }
    public HashMap selectSurveyResponseDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SurveyResponseEJBDAO.SelectSurveyResponseDetail", param);
    }
    public HashMap updateSurveyResponse(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SurveyResponseEJBDAO.UpdateSurveyResponse", param);
    }
    public HashMap deleteSurveyResponse(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SurveyResponseEJBDAO.DeleteSurveyResponse", param);
    }
}