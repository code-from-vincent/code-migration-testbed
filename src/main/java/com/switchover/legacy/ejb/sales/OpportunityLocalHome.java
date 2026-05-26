package com.switchover.legacy.ejb.sales;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface OpportunityLocalHome extends EJBLocalHome {
    OpportunityLocal create() throws CreateException;
}