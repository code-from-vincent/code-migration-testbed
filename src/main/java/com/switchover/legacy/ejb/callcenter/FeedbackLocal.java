package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface FeedbackLocal extends EJBLocalObject {
    HashMap insertFeedback(DefaultParameters param) throws DefaultEJBException;
    Collection selectFeedbackList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectFeedbackDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateFeedback(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteFeedback(DefaultParameters param) throws DefaultEJBException;
}