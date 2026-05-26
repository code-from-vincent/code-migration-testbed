package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface BankAccountLocalHome extends EJBLocalHome {
    BankAccountLocal create() throws CreateException;
}