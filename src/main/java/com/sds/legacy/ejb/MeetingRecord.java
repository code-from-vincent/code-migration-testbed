package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface MeetingRecord extends DefaultSession {
    HashMap insertMeetingRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMeetingRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMeetingRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMeetingRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMeetingRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
