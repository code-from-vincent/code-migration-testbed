package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface LegalCase extends DefaultSession {
    HashMap insertLegalCase(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectLegalCaseList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectLegalCaseDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateLegalCase(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteLegalCase(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
