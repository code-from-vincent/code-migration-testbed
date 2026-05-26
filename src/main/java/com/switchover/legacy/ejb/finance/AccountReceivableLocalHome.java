package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface AccountReceivableLocalHome extends EJBLocalHome {
    AccountReceivableLocal create() throws CreateException;
}