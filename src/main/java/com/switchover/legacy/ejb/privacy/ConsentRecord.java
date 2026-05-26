package com.switchover.legacy.ejb.privacy;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ConsentRecord extends EJBObject {
    HashMap insertConsentRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectConsentRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectConsentRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateConsentRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteConsentRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
