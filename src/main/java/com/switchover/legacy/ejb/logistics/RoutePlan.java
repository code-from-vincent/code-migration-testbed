package com.switchover.legacy.ejb.logistics;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface RoutePlan extends EJBObject {
    HashMap insertRoutePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRoutePlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRoutePlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRoutePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRoutePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
