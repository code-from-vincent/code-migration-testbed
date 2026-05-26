package com.switchover.legacy.ejb.infra;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SchedulerTask extends EJBObject {
    HashMap insertSchedulerTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSchedulerTaskList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSchedulerTaskDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSchedulerTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSchedulerTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
