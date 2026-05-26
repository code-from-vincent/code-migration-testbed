package com.switchover.legacy.ejb.itsm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Incident extends EJBObject {
    HashMap insertIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectIncidentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectIncidentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
