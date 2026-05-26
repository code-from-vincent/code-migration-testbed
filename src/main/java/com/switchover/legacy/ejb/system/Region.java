package com.switchover.legacy.ejb.system;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Region extends EJBObject {
    HashMap insertRegion(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRegionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRegionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRegion(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRegion(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
