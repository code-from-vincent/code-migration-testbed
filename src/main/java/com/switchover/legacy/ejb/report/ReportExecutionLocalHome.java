package com.switchover.legacy.ejb.report;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ReportExecutionLocalHome extends EJBLocalHome {
    ReportExecutionLocal create() throws CreateException;
}