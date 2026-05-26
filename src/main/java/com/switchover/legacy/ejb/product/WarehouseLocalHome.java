package com.switchover.legacy.ejb.product;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface WarehouseLocalHome extends EJBLocalHome {
    WarehouseLocal create() throws CreateException;
}