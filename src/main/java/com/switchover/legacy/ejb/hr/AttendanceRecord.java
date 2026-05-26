package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface AttendanceRecord extends EJBObject {
    HashMap insertAttendanceRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAttendanceRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAttendanceRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAttendanceRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAttendanceRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
