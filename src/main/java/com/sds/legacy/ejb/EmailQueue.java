package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface EmailQueue extends DefaultSession {
    HashMap insertEmailQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectEmailQueueList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectEmailQueueDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateEmailQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteEmailQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
