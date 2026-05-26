package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface AccountPayableLocalHome extends EJBLocalHome {
    AccountPayableLocal create() throws CreateException;
}