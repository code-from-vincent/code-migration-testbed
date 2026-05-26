package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Store extends DefaultSession {
    HashMap insertStore(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectStoreList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectStoreDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateStore(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteStore(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
