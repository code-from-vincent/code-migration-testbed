package com.switchover.legacy.ejb.procurement;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PurchaseOrderLocalHome extends EJBLocalHome {
    PurchaseOrderLocal create() throws CreateException;
}