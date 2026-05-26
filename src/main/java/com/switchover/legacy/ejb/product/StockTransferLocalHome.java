package com.switchover.legacy.ejb.product;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface StockTransferLocalHome extends EJBLocalHome {
    StockTransferLocal create() throws CreateException;
}