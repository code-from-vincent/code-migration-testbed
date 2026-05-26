package com.switchover.legacy.ejb.infra;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface BackupJob extends EJBObject {
    HashMap insertBackupJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBackupJobList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBackupJobDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBackupJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBackupJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
