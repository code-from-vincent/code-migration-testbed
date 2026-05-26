package com.switchover.legacy.ejb.callcenter;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface FeedbackLocalHome extends EJBLocalHome {
    FeedbackLocal create() throws CreateException;
}