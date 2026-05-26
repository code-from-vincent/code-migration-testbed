package com.switchover.legacy.ejb.rd;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SampleInventoryLocalHome extends EJBLocalHome {
    SampleInventoryLocal create() throws CreateException;
}