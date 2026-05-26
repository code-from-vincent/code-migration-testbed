package com.switchover.legacy.ejb.hr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface TrainingEnrollmentLocalHome extends EJBLocalHome {
    TrainingEnrollmentLocal create() throws CreateException;
}