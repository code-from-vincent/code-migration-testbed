package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface LoginHistory extends DefaultSession {
    HashMap insertLoginHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectLoginHistoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectLoginHistoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateLoginHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteLoginHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
