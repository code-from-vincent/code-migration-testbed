package com.switchover.legacy.ejb.notification;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface NotificationTemplate extends EJBObject {
    HashMap insertNotificationTemplate(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectNotificationTemplateList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectNotificationTemplateDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateNotificationTemplate(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteNotificationTemplate(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
