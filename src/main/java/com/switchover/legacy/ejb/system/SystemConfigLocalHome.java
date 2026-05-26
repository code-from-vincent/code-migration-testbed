package com.switchover.legacy.ejb.system;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SystemConfigLocalHome extends EJBLocalHome {
    SystemConfigLocal create() throws CreateException;
}