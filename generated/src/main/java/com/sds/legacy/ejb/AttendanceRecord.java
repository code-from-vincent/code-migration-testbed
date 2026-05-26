package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface AttendanceRecord extends DefaultSession {
    HashMap insertAttendanceRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAttendanceRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAttendanceRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAttendanceRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAttendanceRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
