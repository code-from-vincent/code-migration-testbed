package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface DocumentApproval extends DefaultSession {
    HashMap insertDocumentApproval(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDocumentApprovalList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDocumentApprovalDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDocumentApproval(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDocumentApproval(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
