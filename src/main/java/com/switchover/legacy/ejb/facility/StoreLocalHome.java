package com.switchover.legacy.ejb.facility;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface StoreLocalHome extends EJBLocalHome {
    StoreLocal create() throws CreateException;
}