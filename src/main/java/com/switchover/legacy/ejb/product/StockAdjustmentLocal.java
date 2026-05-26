package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface StockAdjustmentLocal extends EJBLocalObject {
    HashMap insertStockAdjustment(DefaultParameters param) throws DefaultEJBException;
    Collection selectStockAdjustmentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectStockAdjustmentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateStockAdjustment(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteStockAdjustment(DefaultParameters param) throws DefaultEJBException;
}