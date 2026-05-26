package com.switchover.legacy.ejb.infra;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface RestoreJob extends EJBObject {
    HashMap insertRestoreJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRestoreJobList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRestoreJobDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRestoreJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRestoreJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
