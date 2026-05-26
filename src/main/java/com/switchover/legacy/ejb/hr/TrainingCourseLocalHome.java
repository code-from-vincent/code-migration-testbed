package com.switchover.legacy.ejb.hr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface TrainingCourseLocalHome extends EJBLocalHome {
    TrainingCourseLocal create() throws CreateException;
}