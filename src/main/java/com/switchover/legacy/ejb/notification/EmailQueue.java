package com.switchover.legacy.ejb.notification;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface EmailQueue extends EJBObject {
    HashMap insertEmailQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectEmailQueueList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectEmailQueueDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateEmailQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteEmailQueue(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
