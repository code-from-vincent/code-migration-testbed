package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Appointment extends DefaultSession {
    HashMap insertAppointment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAppointmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAppointmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAppointment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAppointment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
