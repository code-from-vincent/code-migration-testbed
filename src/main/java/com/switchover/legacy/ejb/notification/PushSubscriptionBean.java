package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PushSubscriptionBean extends DefaultSession {
    private final PushSubscriptionEJBDAO pushSubscriptionEJBDAO = new PushSubscriptionEJBDAO();
    public HashMap insertPushSubscription(DefaultParameters param) throws DefaultEJBException {
        return pushSubscriptionEJBDAO.insertPushSubscription(param);
    }
    public Collection selectPushSubscriptionList(DefaultParameters param) throws DefaultEJBException {
        return pushSubscriptionEJBDAO.selectPushSubscriptionList(param);
    }
    public HashMap selectPushSubscriptionDetail(DefaultParameters param) throws DefaultEJBException {
        return pushSubscriptionEJBDAO.selectPushSubscriptionDetail(param);
    }
    public HashMap updatePushSubscription(DefaultParameters param) throws DefaultEJBException {
        return pushSubscriptionEJBDAO.updatePushSubscription(param);
    }
    public HashMap deletePushSubscription(DefaultParameters param) throws DefaultEJBException {
        return pushSubscriptionEJBDAO.deletePushSubscription(param);
    }
}