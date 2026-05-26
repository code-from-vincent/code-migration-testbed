package com.switchover.legacy.ejb.project;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface FeatureFlag extends EJBObject {
    HashMap insertFeatureFlag(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFeatureFlagList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFeatureFlagDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFeatureFlag(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFeatureFlag(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
