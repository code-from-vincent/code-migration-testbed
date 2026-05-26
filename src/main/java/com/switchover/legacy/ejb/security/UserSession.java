package com.switchover.legacy.ejb.security;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface UserSession extends EJBObject {
    HashMap insertUserSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectUserSessionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectUserSessionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateUserSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteUserSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
