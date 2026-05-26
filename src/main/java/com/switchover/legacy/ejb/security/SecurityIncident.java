package com.switchover.legacy.ejb.security;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SecurityIncident extends EJBObject {
    HashMap insertSecurityIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSecurityIncidentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSecurityIncidentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSecurityIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSecurityIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
