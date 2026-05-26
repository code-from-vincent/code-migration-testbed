package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ApprovalLine extends DefaultSession {
    HashMap insertApprovalLine(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectApprovalLineList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectApprovalLineDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateApprovalLine(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteApprovalLine(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
