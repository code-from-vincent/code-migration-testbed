package com.switchover.legacy.ejb.governance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ScenarioPlan extends EJBObject {
    HashMap insertScenarioPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectScenarioPlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectScenarioPlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateScenarioPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteScenarioPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
