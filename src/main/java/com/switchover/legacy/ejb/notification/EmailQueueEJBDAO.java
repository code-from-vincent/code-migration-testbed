package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class EmailQueueEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/notification/074_emailqueue/EmailQueue_SQL.xml";
    public HashMap insertEmailQueue(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EmailQueueEJBDAO.InsertEmailQueue", param);
    }
    public Collection selectEmailQueueList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "EmailQueueEJBDAO.SelectEmailQueueList", param);
    }
    public HashMap selectEmailQueueDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EmailQueueEJBDAO.SelectEmailQueueDetail", param);
    }
    public HashMap updateEmailQueue(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EmailQueueEJBDAO.UpdateEmailQueue", param);
    }
    public HashMap deleteEmailQueue(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EmailQueueEJBDAO.DeleteEmailQueue", param);
    }
}