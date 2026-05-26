package com.switchover.legacy.ejb.sales;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CustomerLocalHome extends EJBLocalHome {
    CustomerLocal create() throws CreateException;
}