package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ApiAccessLog extends DefaultSession {
    HashMap insertApiAccessLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectApiAccessLogList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectApiAccessLogDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateApiAccessLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteApiAccessLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
