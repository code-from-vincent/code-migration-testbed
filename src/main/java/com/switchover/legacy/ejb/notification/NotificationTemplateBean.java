package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class NotificationTemplateBean extends DefaultSession {
    private final NotificationTemplateEJBDAO notificationTemplateEJBDAO = new NotificationTemplateEJBDAO();
    public HashMap insertNotificationTemplate(DefaultParameters param) throws DefaultEJBException {
        return notificationTemplateEJBDAO.insertNotificationTemplate(param);
    }
    public Collection selectNotificationTemplateList(DefaultParameters param) throws DefaultEJBException {
        return notificationTemplateEJBDAO.selectNotificationTemplateList(param);
    }
    public HashMap selectNotificationTemplateDetail(DefaultParameters param) throws DefaultEJBException {
        return notificationTemplateEJBDAO.selectNotificationTemplateDetail(param);
    }
    public HashMap updateNotificationTemplate(DefaultParameters param) throws DefaultEJBException {
        return notificationTemplateEJBDAO.updateNotificationTemplate(param);
    }
    public HashMap deleteNotificationTemplate(DefaultParameters param) throws DefaultEJBException {
        return notificationTemplateEJBDAO.deleteNotificationTemplate(param);
    }
}