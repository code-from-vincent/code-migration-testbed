package com.switchover.legacy.ejb.itsm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SupportRequest extends EJBObject {
    HashMap insertSupportRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSupportRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSupportRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSupportRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSupportRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
