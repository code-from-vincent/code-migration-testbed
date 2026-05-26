package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Reservation extends DefaultSession {
    HashMap insertReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectReservationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectReservationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
