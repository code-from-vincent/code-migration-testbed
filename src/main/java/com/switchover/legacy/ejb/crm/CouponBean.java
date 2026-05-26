package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CouponBean extends DefaultSession {
    private final CouponEJBDAO couponEJBDAO = new CouponEJBDAO();
    public HashMap insertCoupon(DefaultParameters param) throws DefaultEJBException {
        return couponEJBDAO.insertCoupon(param);
    }
    public Collection selectCouponList(DefaultParameters param) throws DefaultEJBException {
        return couponEJBDAO.selectCouponList(param);
    }
    public HashMap selectCouponDetail(DefaultParameters param) throws DefaultEJBException {
        return couponEJBDAO.selectCouponDetail(param);
    }
    public HashMap updateCoupon(DefaultParameters param) throws DefaultEJBException {
        return couponEJBDAO.updateCoupon(param);
    }
    public HashMap deleteCoupon(DefaultParameters param) throws DefaultEJBException {
        return couponEJBDAO.deleteCoupon(param);
    }
}