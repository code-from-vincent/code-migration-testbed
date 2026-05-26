package com.switchover.legacy.ejb.product;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface AssetLocalHome extends EJBLocalHome {
    AssetLocal create() throws CreateException;
}