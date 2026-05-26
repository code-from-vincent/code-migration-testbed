package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Shareholder extends DefaultSession {
    HashMap insertShareholder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectShareholderList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectShareholderDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateShareholder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteShareholder(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
