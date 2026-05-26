package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class NotificationHistoryBean extends DefaultSession {
    private final NotificationHistoryEJBDAO notificationHistoryEJBDAO = new NotificationHistoryEJBDAO();
    public HashMap insertNotificationHistory(DefaultParameters param) throws DefaultEJBException {
        return notificationHistoryEJBDAO.insertNotificationHistory(param);
    }
    public Collection selectNotificationHistoryList(DefaultParameters param) throws DefaultEJBException {
        return notificationHistoryEJBDAO.selectNotificationHistoryList(param);
    }
    public HashMap selectNotificationHistoryDetail(DefaultParameters param) throws DefaultEJBException {
        return notificationHistoryEJBDAO.selectNotificationHistoryDetail(param);
    }
    public HashMap updateNotificationHistory(DefaultParameters param) throws DefaultEJBException {
        return notificationHistoryEJBDAO.updateNotificationHistory(param);
    }
    public HashMap deleteNotificationHistory(DefaultParameters param) throws DefaultEJBException {
        return notificationHistoryEJBDAO.deleteNotificationHistory(param);
    }
}