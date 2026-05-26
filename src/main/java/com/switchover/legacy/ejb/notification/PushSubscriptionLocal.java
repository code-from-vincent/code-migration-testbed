package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PushSubscriptionLocal extends EJBLocalObject {
    HashMap insertPushSubscription(DefaultParameters param) throws DefaultEJBException;
    Collection selectPushSubscriptionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPushSubscriptionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePushSubscription(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePushSubscription(DefaultParameters param) throws DefaultEJBException;
}