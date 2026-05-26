package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface AccountReceivable extends DefaultSession {
    HashMap insertAccountReceivable(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAccountReceivableList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAccountReceivableDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAccountReceivable(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAccountReceivable(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
