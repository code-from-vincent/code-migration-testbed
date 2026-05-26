package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface AuditLog extends DefaultSession {
    HashMap insertAuditLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAuditLogList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAuditLogDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAuditLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAuditLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
