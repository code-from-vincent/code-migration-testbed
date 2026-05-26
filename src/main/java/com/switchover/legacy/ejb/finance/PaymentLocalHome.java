package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PaymentLocalHome extends EJBLocalHome {
    PaymentLocal create() throws CreateException;
}