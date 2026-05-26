package com.switchover.legacy.ejb.callcenter;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface CallRecord extends EJBObject {
    HashMap insertCallRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCallRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCallRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCallRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCallRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
