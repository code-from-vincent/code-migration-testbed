package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ProcurementRequest extends DefaultSession {
    HashMap insertProcurementRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProcurementRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProcurementRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProcurementRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProcurementRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
