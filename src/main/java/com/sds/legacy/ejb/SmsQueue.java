package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface SmsQueue extends DefaultSession {
    HashMap insertSmsQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSmsQueueList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSmsQueueDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSmsQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSmsQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
