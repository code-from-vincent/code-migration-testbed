package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ApiClient extends DefaultSession {
    HashMap insertApiClient(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectApiClientList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectApiClientDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateApiClient(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteApiClient(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
