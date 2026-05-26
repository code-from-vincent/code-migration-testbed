package com.switchover.legacy.ejb.facility;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface VehicleReservation extends EJBObject {
    HashMap insertVehicleReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectVehicleReservationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectVehicleReservationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateVehicleReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteVehicleReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
