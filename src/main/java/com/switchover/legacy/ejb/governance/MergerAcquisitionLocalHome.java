package com.switchover.legacy.ejb.governance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface MergerAcquisitionLocalHome extends EJBLocalHome {
    MergerAcquisitionLocal create() throws CreateException;
}