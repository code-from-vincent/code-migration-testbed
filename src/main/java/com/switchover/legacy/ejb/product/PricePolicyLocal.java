package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PricePolicyLocal extends EJBLocalObject {
    HashMap insertPricePolicy(DefaultParameters param) throws DefaultEJBException;
    Collection selectPricePolicyList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPricePolicyDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePricePolicy(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePricePolicy(DefaultParameters param) throws DefaultEJBException;
}