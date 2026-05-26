package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Incident extends DefaultSession {
    HashMap insertIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectIncidentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectIncidentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
