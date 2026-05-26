package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Region extends DefaultSession {
    HashMap insertRegion(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRegionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRegionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRegion(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRegion(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
