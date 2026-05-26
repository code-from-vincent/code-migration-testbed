package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CouponLocal extends EJBLocalObject {
    HashMap insertCoupon(DefaultParameters param) throws DefaultEJBException;
    Collection selectCouponList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCouponDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCoupon(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCoupon(DefaultParameters param) throws DefaultEJBException;
}