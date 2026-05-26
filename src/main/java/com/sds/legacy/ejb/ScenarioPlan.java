package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ScenarioPlan extends DefaultSession {
    HashMap insertScenarioPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectScenarioPlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectScenarioPlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateScenarioPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteScenarioPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
