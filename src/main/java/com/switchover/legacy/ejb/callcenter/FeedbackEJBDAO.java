package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class FeedbackEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/callcenter/141_feedback/Feedback_SQL.xml";
    public HashMap insertFeedback(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FeedbackEJBDAO.InsertFeedback", param);
    }
    public Collection selectFeedbackList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "FeedbackEJBDAO.SelectFeedbackList", param);
    }
    public HashMap selectFeedbackDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FeedbackEJBDAO.SelectFeedbackDetail", param);
    }
    public HashMap updateFeedback(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FeedbackEJBDAO.UpdateFeedback", param);
    }
    public HashMap deleteFeedback(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FeedbackEJBDAO.DeleteFeedback", param);
    }
}