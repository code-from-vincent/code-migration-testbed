package com.switchover.legacy.ejb.document;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ArchiveRecord extends EJBObject {
    HashMap insertArchiveRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectArchiveRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectArchiveRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateArchiveRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteArchiveRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
