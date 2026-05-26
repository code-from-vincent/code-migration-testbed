package com.switchover.legacy.ejb.system;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface UserRoleLocalHome extends EJBLocalHome {
    UserRoleLocal create() throws CreateException;
}