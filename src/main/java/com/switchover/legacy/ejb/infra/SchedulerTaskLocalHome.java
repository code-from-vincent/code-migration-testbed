package com.switchover.legacy.ejb.infra;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SchedulerTaskLocalHome extends EJBLocalHome {
    SchedulerTaskLocal create() throws CreateException;
}