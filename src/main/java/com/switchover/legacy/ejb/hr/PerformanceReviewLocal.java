package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PerformanceReviewLocal extends EJBLocalObject {
    HashMap insertPerformanceReview(DefaultParameters param) throws DefaultEJBException;
    Collection selectPerformanceReviewList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPerformanceReviewDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePerformanceReview(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePerformanceReview(DefaultParameters param) throws DefaultEJBException;
}