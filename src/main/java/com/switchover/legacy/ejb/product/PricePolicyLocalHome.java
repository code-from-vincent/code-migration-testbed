package com.switchover.legacy.ejb.product;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PricePolicyLocalHome extends EJBLocalHome {
    PricePolicyLocal create() throws CreateException;
}