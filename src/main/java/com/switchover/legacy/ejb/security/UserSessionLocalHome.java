package com.switchover.legacy.ejb.security;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface UserSessionLocalHome extends EJBLocalHome {
    UserSessionLocal create() throws CreateException;
}