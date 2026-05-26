package com.switchover.legacy.ejb.hr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PerformanceReviewLocalHome extends EJBLocalHome {
    PerformanceReviewLocal create() throws CreateException;
}