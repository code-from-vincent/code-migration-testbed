package com.switchover.legacy.ejb.procurement;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PurchaseOrderItemLocalHome extends EJBLocalHome {
    PurchaseOrderItemLocal create() throws CreateException;
}