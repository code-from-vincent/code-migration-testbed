package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface GrantApplication extends DefaultSession {
    HashMap insertGrantApplication(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectGrantApplicationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectGrantApplicationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateGrantApplication(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteGrantApplication(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
