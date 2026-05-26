package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface NotificationHistoryLocal extends EJBLocalObject {
    HashMap insertNotificationHistory(DefaultParameters param) throws DefaultEJBException;
    Collection selectNotificationHistoryList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectNotificationHistoryDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateNotificationHistory(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteNotificationHistory(DefaultParameters param) throws DefaultEJBException;
}