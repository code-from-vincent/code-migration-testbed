package com.switchover.legacy.ejb.sales;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ReturnOrderLocalHome extends EJBLocalHome {
    ReturnOrderLocal create() throws CreateException;
}