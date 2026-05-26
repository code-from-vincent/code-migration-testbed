package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ServiceRequest extends DefaultSession {
    HashMap insertServiceRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectServiceRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectServiceRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateServiceRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteServiceRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
