package com.switchover.legacy.ejb.governance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface StrategicInitiative extends EJBObject {
    HashMap insertStrategicInitiative(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectStrategicInitiativeList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectStrategicInitiativeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateStrategicInitiative(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteStrategicInitiative(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
