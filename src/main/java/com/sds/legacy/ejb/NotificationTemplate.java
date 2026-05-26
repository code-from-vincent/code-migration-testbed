package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface NotificationTemplate extends DefaultSession {
    HashMap insertNotificationTemplate(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectNotificationTemplateList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectNotificationTemplateDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateNotificationTemplate(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteNotificationTemplate(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
