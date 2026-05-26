package com.switchover.legacy.ejb.security;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PasswordPolicyLocalHome extends EJBLocalHome {
    PasswordPolicyLocal create() throws CreateException;
}