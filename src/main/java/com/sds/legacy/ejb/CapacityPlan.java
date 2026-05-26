package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface CapacityPlan extends DefaultSession {
    HashMap insertCapacityPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCapacityPlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCapacityPlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCapacityPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCapacityPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
