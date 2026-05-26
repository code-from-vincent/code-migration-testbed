package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ExpenseReportLocalHome extends EJBLocalHome {
    ExpenseReportLocal create() throws CreateException;
}