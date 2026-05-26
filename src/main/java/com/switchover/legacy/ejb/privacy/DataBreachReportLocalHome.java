package com.switchover.legacy.ejb.privacy;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DataBreachReportLocalHome extends EJBLocalHome {
    DataBreachReportLocal create() throws CreateException;
}