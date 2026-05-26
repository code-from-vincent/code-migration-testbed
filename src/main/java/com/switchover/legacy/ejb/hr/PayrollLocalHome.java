package com.switchover.legacy.ejb.hr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PayrollLocalHome extends EJBLocalHome {
    PayrollLocal create() throws CreateException;
}