package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Facility extends DefaultSession {
    HashMap insertFacility(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFacilityList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFacilityDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFacility(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFacility(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
