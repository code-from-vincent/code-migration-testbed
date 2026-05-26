package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface LabResult extends DefaultSession {
    HashMap insertLabResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectLabResultList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectLabResultDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateLabResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteLabResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
