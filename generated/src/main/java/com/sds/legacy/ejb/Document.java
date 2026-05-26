package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Document extends DefaultSession {
    HashMap insertDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDocumentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDocumentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
