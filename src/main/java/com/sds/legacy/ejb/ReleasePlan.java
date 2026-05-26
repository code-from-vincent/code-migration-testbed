package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ReleasePlan extends DefaultSession {
    HashMap insertReleasePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectReleasePlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectReleasePlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateReleasePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteReleasePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
