package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ChangeRequest extends DefaultSession {
    HashMap insertChangeRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectChangeRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectChangeRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateChangeRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteChangeRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
