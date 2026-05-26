package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface VehicleReservation extends DefaultSession {
    HashMap insertVehicleReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectVehicleReservationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectVehicleReservationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateVehicleReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteVehicleReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
