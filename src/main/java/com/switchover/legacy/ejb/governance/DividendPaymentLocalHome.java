package com.switchover.legacy.ejb.governance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DividendPaymentLocalHome extends EJBLocalHome {
    DividendPaymentLocal create() throws CreateException;
}