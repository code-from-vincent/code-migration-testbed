package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface AccountPayable extends DefaultSession {
    HashMap insertAccountPayable(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAccountPayableList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAccountPayableDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAccountPayable(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAccountPayable(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
