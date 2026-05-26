package com.switchover.legacy.ejb.sales;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SalesOrderLocalHome extends EJBLocalHome {
    SalesOrderLocal create() throws CreateException;
}