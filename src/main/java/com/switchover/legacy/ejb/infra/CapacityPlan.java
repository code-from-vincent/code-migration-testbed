package com.switchover.legacy.ejb.infra;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface CapacityPlan extends EJBObject {
    HashMap insertCapacityPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCapacityPlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCapacityPlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCapacityPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCapacityPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
