package com.switchover.legacy.ejb.notification;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface NotificationHistoryLocalHome extends EJBLocalHome {
    NotificationHistoryLocal create() throws CreateException;
}