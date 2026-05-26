package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface SchedulerTask extends DefaultSession {
    HashMap insertSchedulerTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSchedulerTaskList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSchedulerTaskDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSchedulerTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSchedulerTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
