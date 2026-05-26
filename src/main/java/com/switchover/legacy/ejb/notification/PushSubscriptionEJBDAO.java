package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PushSubscriptionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/notification/076_pushsubscription/PushSubscription_SQL.xml";
    public HashMap insertPushSubscription(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PushSubscriptionEJBDAO.InsertPushSubscription", param);
    }
    public Collection selectPushSubscriptionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PushSubscriptionEJBDAO.SelectPushSubscriptionList", param);
    }
    public HashMap selectPushSubscriptionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PushSubscriptionEJBDAO.SelectPushSubscriptionDetail", param);
    }
    public HashMap updatePushSubscription(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PushSubscriptionEJBDAO.UpdatePushSubscription", param);
    }
    public HashMap deletePushSubscription(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PushSubscriptionEJBDAO.DeletePushSubscription", param);
    }
}