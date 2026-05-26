package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface SystemConfig extends DefaultSession {
    HashMap insertSystemConfig(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSystemConfigList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSystemConfigDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSystemConfig(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSystemConfig(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
