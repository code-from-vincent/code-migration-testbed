package com.switchover.legacy.ejb.procurement;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface VendorLocalHome extends EJBLocalHome {
    VendorLocal create() throws CreateException;
}