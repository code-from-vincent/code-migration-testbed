package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface LeaveRequest extends DefaultSession {
    HashMap insertLeaveRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectLeaveRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectLeaveRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateLeaveRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteLeaveRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
