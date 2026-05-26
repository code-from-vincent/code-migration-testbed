package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface CorrectiveAction extends DefaultSession {
    HashMap insertCorrectiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCorrectiveActionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCorrectiveActionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCorrectiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCorrectiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
