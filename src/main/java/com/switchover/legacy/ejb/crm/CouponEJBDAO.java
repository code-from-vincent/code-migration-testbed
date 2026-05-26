package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CouponEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/crm/092_coupon/Coupon_SQL.xml";
    public HashMap insertCoupon(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CouponEJBDAO.InsertCoupon", param);
    }
    public Collection selectCouponList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CouponEJBDAO.SelectCouponList", param);
    }
    public HashMap selectCouponDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CouponEJBDAO.SelectCouponDetail", param);
    }
    public HashMap updateCoupon(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CouponEJBDAO.UpdateCoupon", param);
    }
    public HashMap deleteCoupon(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CouponEJBDAO.DeleteCoupon", param);
    }
}