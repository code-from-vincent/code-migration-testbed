package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface UserAccount extends DefaultSession {
    HashMap insertUserAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectUserAccountList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectUserAccountDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateUserAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteUserAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
