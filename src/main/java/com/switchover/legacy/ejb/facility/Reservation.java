package com.switchover.legacy.ejb.facility;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Reservation extends EJBObject {
    HashMap insertReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectReservationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectReservationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteReservation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
