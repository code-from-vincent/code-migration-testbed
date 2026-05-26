package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CashTransactionLocalHome extends EJBLocalHome {
    CashTransactionLocal create() throws CreateException;
}