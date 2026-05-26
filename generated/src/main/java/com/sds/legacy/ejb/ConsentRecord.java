package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ConsentRecord extends DefaultSession {
    HashMap insertConsentRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectConsentRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectConsentRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateConsentRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteConsentRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
