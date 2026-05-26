package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Event extends DefaultSession {
    HashMap insertEvent(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectEventList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectEventDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateEvent(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteEvent(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
