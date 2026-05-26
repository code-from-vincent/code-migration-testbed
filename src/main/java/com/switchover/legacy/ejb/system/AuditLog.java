package com.switchover.legacy.ejb.system;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface AuditLog extends EJBObject {
    HashMap insertAuditLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAuditLogList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAuditLogDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAuditLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAuditLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
