package com.switchover.legacy.ejb.system;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface MenuLocalHome extends EJBLocalHome {
    MenuLocal create() throws CreateException;
}