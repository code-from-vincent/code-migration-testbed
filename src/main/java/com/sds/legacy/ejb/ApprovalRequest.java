package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ApprovalRequest extends DefaultSession {
    HashMap insertApprovalRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectApprovalRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectApprovalRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateApprovalRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteApprovalRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
