package com.switchover.legacy.ejb.security;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface LoginHistory extends EJBObject {
    HashMap insertLoginHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectLoginHistoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectLoginHistoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateLoginHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteLoginHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
