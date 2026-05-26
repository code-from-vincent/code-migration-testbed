package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface NotificationTemplateLocal extends EJBLocalObject {
    HashMap insertNotificationTemplate(DefaultParameters param) throws DefaultEJBException;
    Collection selectNotificationTemplateList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectNotificationTemplateDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateNotificationTemplate(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteNotificationTemplate(DefaultParameters param) throws DefaultEJBException;
}