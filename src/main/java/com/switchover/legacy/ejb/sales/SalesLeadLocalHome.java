package com.switchover.legacy.ejb.sales;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SalesLeadLocalHome extends EJBLocalHome {
    SalesLeadLocal create() throws CreateException;
}