package com.switchover.legacy.ejb.sales;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CustomerContactLocalHome extends EJBLocalHome {
    CustomerContactLocal create() throws CreateException;
}