package com.switchover.legacy.ejb.privacy;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PrivacyRequestLocalHome extends EJBLocalHome {
    PrivacyRequestLocal create() throws CreateException;
}