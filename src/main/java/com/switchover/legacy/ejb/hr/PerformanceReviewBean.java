package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PerformanceReviewBean extends DefaultSession {
    private final PerformanceReviewEJBDAO performanceReviewEJBDAO = new PerformanceReviewEJBDAO();
    public HashMap insertPerformanceReview(DefaultParameters param) throws DefaultEJBException {
        return performanceReviewEJBDAO.insertPerformanceReview(param);
    }
    public Collection selectPerformanceReviewList(DefaultParameters param) throws DefaultEJBException {
        return performanceReviewEJBDAO.selectPerformanceReviewList(param);
    }
    public HashMap selectPerformanceReviewDetail(DefaultParameters param) throws DefaultEJBException {
        return performanceReviewEJBDAO.selectPerformanceReviewDetail(param);
    }
    public HashMap updatePerformanceReview(DefaultParameters param) throws DefaultEJBException {
        return performanceReviewEJBDAO.updatePerformanceReview(param);
    }
    public HashMap deletePerformanceReview(DefaultParameters param) throws DefaultEJBException {
        return performanceReviewEJBDAO.deletePerformanceReview(param);
    }
}