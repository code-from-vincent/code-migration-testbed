package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface RestoreJob extends DefaultSession {
    HashMap insertRestoreJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRestoreJobList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRestoreJobDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRestoreJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRestoreJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
