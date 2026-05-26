package com.switchover.legacy.ejb.project;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ChangeRequest extends EJBObject {
    HashMap insertChangeRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectChangeRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectChangeRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateChangeRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteChangeRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
