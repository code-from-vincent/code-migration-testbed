package com.switchover.legacy.ejb.logistics;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Vehicle extends EJBObject {
    HashMap insertVehicle(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectVehicleList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectVehicleDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateVehicle(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteVehicle(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
