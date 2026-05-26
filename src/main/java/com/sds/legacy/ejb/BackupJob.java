package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface BackupJob extends DefaultSession {
    HashMap insertBackupJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBackupJobList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBackupJobDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBackupJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBackupJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
