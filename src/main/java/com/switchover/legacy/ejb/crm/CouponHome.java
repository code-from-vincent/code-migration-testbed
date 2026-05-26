package com.switchover.legacy.ejb.crm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface CouponHome extends EJBHome {
    Coupon create() throws CreateException, RemoteException;
}