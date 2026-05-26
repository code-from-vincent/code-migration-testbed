package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface GeneralLedger extends DefaultSession {
    HashMap insertGeneralLedger(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectGeneralLedgerList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectGeneralLedgerDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateGeneralLedger(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteGeneralLedger(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
