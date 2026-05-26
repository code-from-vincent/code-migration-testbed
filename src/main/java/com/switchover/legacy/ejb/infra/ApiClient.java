package com.switchover.legacy.ejb.infra;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ApiClient extends EJBObject {
    HashMap insertApiClient(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectApiClientList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectApiClientDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateApiClient(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteApiClient(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
