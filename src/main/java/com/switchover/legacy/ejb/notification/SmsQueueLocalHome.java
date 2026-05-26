package com.switchover.legacy.ejb.notification;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SmsQueueLocalHome extends EJBLocalHome {
    SmsQueueLocal create() throws CreateException;
}