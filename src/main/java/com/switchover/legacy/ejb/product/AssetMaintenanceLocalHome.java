package com.switchover.legacy.ejb.product;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface AssetMaintenanceLocalHome extends EJBLocalHome {
    AssetMaintenanceLocal create() throws CreateException;
}