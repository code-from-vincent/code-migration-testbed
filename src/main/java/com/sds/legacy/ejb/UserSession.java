package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface UserSession extends DefaultSession {
    HashMap insertUserSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectUserSessionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectUserSessionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateUserSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteUserSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
