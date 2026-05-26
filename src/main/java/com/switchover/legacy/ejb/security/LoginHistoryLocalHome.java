package com.switchover.legacy.ejb.security;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface LoginHistoryLocalHome extends EJBLocalHome {
    LoginHistoryLocal create() throws CreateException;
}