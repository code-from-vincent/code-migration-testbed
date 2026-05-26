package com.switchover.legacy.ejb.callcenter;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CorrectiveActionLocalHome extends EJBLocalHome {
    CorrectiveActionLocal create() throws CreateException;
}