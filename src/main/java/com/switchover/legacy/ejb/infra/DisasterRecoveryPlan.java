package com.switchover.legacy.ejb.infra;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface DisasterRecoveryPlan extends EJBObject {
    HashMap insertDisasterRecoveryPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDisasterRecoveryPlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDisasterRecoveryPlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDisasterRecoveryPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDisasterRecoveryPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
