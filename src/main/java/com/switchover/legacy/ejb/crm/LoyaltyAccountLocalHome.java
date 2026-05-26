package com.switchover.legacy.ejb.crm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface LoyaltyAccountLocalHome extends EJBLocalHome {
    LoyaltyAccountLocal create() throws CreateException;
}