package com.switchover.legacy.ejb.itsm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ServiceRequest extends EJBObject {
    HashMap insertServiceRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectServiceRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectServiceRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateServiceRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteServiceRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
