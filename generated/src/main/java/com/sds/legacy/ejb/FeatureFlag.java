package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface FeatureFlag extends DefaultSession {
    HashMap insertFeatureFlag(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFeatureFlagList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFeatureFlagDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFeatureFlag(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFeatureFlag(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
