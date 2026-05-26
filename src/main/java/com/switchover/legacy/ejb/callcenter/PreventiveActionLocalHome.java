package com.switchover.legacy.ejb.callcenter;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PreventiveActionLocalHome extends EJBLocalHome {
    PreventiveActionLocal create() throws CreateException;
}