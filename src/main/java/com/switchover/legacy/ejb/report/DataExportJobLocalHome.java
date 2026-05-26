package com.switchover.legacy.ejb.report;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DataExportJobLocalHome extends EJBLocalHome {
    DataExportJobLocal create() throws CreateException;
}