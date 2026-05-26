package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PreventiveAction extends DefaultSession {
    HashMap insertPreventiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPreventiveActionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPreventiveActionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePreventiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePreventiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
