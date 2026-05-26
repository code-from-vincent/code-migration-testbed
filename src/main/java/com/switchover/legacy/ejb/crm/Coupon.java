package com.switchover.legacy.ejb.crm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Coupon extends EJBObject {
    HashMap insertCoupon(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCouponList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCouponDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCoupon(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCoupon(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
