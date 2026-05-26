package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface RoutePlan extends DefaultSession {
    HashMap insertRoutePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRoutePlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRoutePlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRoutePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRoutePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
