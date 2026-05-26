package com.switchover.legacy.ejb.notification;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface NotificationTemplateLocalHome extends EJBLocalHome {
    NotificationTemplateLocal create() throws CreateException;
}