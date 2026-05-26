package com.switchover.legacy.ejb.facility;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Store extends EJBObject {
    HashMap insertStore(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectStoreList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectStoreDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateStore(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteStore(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
