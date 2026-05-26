package com.switchover.legacy.ejb.report;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DashboardLocalHome extends EJBLocalHome {
    DashboardLocal create() throws CreateException;
}