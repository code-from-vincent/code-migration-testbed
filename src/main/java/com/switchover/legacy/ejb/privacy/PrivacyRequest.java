package com.switchover.legacy.ejb.privacy;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PrivacyRequest extends EJBObject {
    HashMap insertPrivacyRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPrivacyRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPrivacyRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePrivacyRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePrivacyRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
