package com.switchover.legacy.ejb.notification;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface NotificationHistory extends EJBObject {
    HashMap insertNotificationHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectNotificationHistoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectNotificationHistoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateNotificationHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteNotificationHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
