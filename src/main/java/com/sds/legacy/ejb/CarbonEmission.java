package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface CarbonEmission extends DefaultSession {
    HashMap insertCarbonEmission(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCarbonEmissionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCarbonEmissionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCarbonEmission(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCarbonEmission(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
