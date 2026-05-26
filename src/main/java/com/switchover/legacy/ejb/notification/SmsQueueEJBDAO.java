package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SmsQueueEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/notification/075_smsqueue/SmsQueue_SQL.xml";
    public HashMap insertSmsQueue(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SmsQueueEJBDAO.InsertSmsQueue", param);
    }
    public Collection selectSmsQueueList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SmsQueueEJBDAO.SelectSmsQueueList", param);
    }
    public HashMap selectSmsQueueDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SmsQueueEJBDAO.SelectSmsQueueDetail", param);
    }
    public HashMap updateSmsQueue(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SmsQueueEJBDAO.UpdateSmsQueue", param);
    }
    public HashMap deleteSmsQueue(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SmsQueueEJBDAO.DeleteSmsQueue", param);
    }
}