package com.switchover.legacy.ejb.document;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface MeetingRecord extends EJBObject {
    HashMap insertMeetingRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMeetingRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMeetingRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMeetingRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMeetingRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
