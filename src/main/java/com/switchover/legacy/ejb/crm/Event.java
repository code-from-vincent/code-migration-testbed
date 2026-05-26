package com.switchover.legacy.ejb.crm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Event extends EJBObject {
    HashMap insertEvent(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectEventList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectEventDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateEvent(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteEvent(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
