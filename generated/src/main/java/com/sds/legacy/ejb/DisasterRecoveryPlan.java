package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface DisasterRecoveryPlan extends DefaultSession {
    HashMap insertDisasterRecoveryPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDisasterRecoveryPlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDisasterRecoveryPlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDisasterRecoveryPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDisasterRecoveryPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
