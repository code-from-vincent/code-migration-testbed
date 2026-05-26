package com.switchover.legacy.ejb.report;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DataImportJobLocalHome extends EJBLocalHome {
    DataImportJobLocal create() throws CreateException;
}