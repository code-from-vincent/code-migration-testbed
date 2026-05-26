package com.switchover.legacy.ejb.notification;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SmsQueue extends EJBObject {
    HashMap insertSmsQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSmsQueueList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSmsQueueDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSmsQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSmsQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
