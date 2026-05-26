package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Trademark extends DefaultSession {
    HashMap insertTrademark(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTrademarkList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTrademarkDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTrademark(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTrademark(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
