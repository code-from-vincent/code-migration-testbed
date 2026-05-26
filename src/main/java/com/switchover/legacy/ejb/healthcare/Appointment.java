package com.switchover.legacy.ejb.healthcare;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Appointment extends EJBObject {
    HashMap insertAppointment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAppointmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAppointmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAppointment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAppointment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
