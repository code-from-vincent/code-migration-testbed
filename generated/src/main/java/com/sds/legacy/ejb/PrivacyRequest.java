package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PrivacyRequest extends DefaultSession {
    HashMap insertPrivacyRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPrivacyRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPrivacyRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePrivacyRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePrivacyRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
