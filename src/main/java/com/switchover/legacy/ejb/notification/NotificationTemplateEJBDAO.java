package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class NotificationTemplateEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/notification/072_notificationtemplate/NotificationTemplate_SQL.xml";
    public HashMap insertNotificationTemplate(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NotificationTemplateEJBDAO.InsertNotificationTemplate", param);
    }
    public Collection selectNotificationTemplateList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "NotificationTemplateEJBDAO.SelectNotificationTemplateList", param);
    }
    public HashMap selectNotificationTemplateDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NotificationTemplateEJBDAO.SelectNotificationTemplateDetail", param);
    }
    public HashMap updateNotificationTemplate(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NotificationTemplateEJBDAO.UpdateNotificationTemplate", param);
    }
    public HashMap deleteNotificationTemplate(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NotificationTemplateEJBDAO.DeleteNotificationTemplate", param);
    }
}