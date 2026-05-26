package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface CallRecord extends DefaultSession {
    HashMap insertCallRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCallRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCallRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCallRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCallRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
