package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PricePolicyBean extends DefaultSession {
    private final PricePolicyEJBDAO pricePolicyEJBDAO = new PricePolicyEJBDAO();
    public HashMap insertPricePolicy(DefaultParameters param) throws DefaultEJBException {
        return pricePolicyEJBDAO.insertPricePolicy(param);
    }
    public Collection selectPricePolicyList(DefaultParameters param) throws DefaultEJBException {
        return pricePolicyEJBDAO.selectPricePolicyList(param);
    }
    public HashMap selectPricePolicyDetail(DefaultParameters param) throws DefaultEJBException {
        return pricePolicyEJBDAO.selectPricePolicyDetail(param);
    }
    public HashMap updatePricePolicy(DefaultParameters param) throws DefaultEJBException {
        return pricePolicyEJBDAO.updatePricePolicy(param);
    }
    public HashMap deletePricePolicy(DefaultParameters param) throws DefaultEJBException {
        return pricePolicyEJBDAO.deletePricePolicy(param);
    }
}