package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class NotificationHistoryEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/notification/073_notificationhistory/NotificationHistory_SQL.xml";
    public HashMap insertNotificationHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NotificationHistoryEJBDAO.InsertNotificationHistory", param);
    }
    public Collection selectNotificationHistoryList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "NotificationHistoryEJBDAO.SelectNotificationHistoryList", param);
    }
    public HashMap selectNotificationHistoryDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NotificationHistoryEJBDAO.SelectNotificationHistoryDetail", param);
    }
    public HashMap updateNotificationHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NotificationHistoryEJBDAO.UpdateNotificationHistory", param);
    }
    public HashMap deleteNotificationHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NotificationHistoryEJBDAO.DeleteNotificationHistory", param);
    }
}