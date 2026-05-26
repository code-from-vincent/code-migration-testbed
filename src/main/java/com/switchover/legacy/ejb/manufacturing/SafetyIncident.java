package com.switchover.legacy.ejb.manufacturing;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SafetyIncident extends EJBObject {
    HashMap insertSafetyIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSafetyIncidentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSafetyIncidentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSafetyIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSafetyIncident(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
