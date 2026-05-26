package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ArchiveRecord extends DefaultSession {
    HashMap insertArchiveRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectArchiveRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectArchiveRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateArchiveRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteArchiveRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
