package com.switchover.legacy.ejb.product;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface StockAdjustmentLocalHome extends EJBLocalHome {
    StockAdjustmentLocal create() throws CreateException;
}