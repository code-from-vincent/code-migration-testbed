package com.switchover.legacy.ejb.crm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CouponLocalHome extends EJBLocalHome {
    CouponLocal create() throws CreateException;
}