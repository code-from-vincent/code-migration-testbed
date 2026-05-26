package com.switchover.legacy.ejb.report;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ReportDefinitionLocalHome extends EJBLocalHome {
    ReportDefinitionLocal create() throws CreateException;
}