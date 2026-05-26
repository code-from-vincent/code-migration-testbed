package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Vehicle extends DefaultSession {
    HashMap insertVehicle(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectVehicleList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectVehicleDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateVehicle(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteVehicle(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
