package com.switchover.legacy.ejb.notification;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PushSubscriptionLocalHome extends EJBLocalHome {
    PushSubscriptionLocal create() throws CreateException;
}