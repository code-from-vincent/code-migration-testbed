package com.switchover.legacy.ejb.hr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface MentoringProgramLocalHome extends EJBLocalHome {
    MentoringProgramLocal create() throws CreateException;
}