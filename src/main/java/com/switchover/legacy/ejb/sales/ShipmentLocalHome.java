package com.switchover.legacy.ejb.sales;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ShipmentLocalHome extends EJBLocalHome {
    ShipmentLocal create() throws CreateException;
}