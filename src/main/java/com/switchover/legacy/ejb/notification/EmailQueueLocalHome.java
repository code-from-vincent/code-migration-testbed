package com.switchover.legacy.ejb.notification;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface EmailQueueLocalHome extends EJBLocalHome {
    EmailQueueLocal create() throws CreateException;
}