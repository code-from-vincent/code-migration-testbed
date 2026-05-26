package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class FeedbackBean extends DefaultSession {
    private final FeedbackEJBDAO feedbackEJBDAO = new FeedbackEJBDAO();
    public HashMap insertFeedback(DefaultParameters param) throws DefaultEJBException {
        return feedbackEJBDAO.insertFeedback(param);
    }
    public Collection selectFeedbackList(DefaultParameters param) throws DefaultEJBException {
        return feedbackEJBDAO.selectFeedbackList(param);
    }
    public HashMap selectFeedbackDetail(DefaultParameters param) throws DefaultEJBException {
        return feedbackEJBDAO.selectFeedbackDetail(param);
    }
    public HashMap updateFeedback(DefaultParameters param) throws DefaultEJBException {
        return feedbackEJBDAO.updateFeedback(param);
    }
    public HashMap deleteFeedback(DefaultParameters param) throws DefaultEJBException {
        return feedbackEJBDAO.deleteFeedback(param);
    }
}