package com.switchover.legacy.ejb.system;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface UserAccountLocalHome extends EJBLocalHome {
    UserAccountLocal create() throws CreateException;
}