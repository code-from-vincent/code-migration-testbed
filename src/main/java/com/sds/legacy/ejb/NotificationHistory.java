package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface NotificationHistory extends DefaultSession {
    HashMap insertNotificationHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectNotificationHistoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectNotificationHistoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateNotificationHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteNotificationHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
