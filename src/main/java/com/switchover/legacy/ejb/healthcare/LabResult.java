package com.switchover.legacy.ejb.healthcare;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface LabResult extends EJBObject {
    HashMap insertLabResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectLabResultList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectLabResultDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateLabResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteLabResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
