package com.switchover.legacy.ejb.crm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface LoyaltyPointTransactionLocalHome extends EJBLocalHome {
    LoyaltyPointTransactionLocal create() throws CreateException;
}