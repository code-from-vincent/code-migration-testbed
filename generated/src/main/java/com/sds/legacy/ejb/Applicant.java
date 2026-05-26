package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Applicant extends DefaultSession {
    HashMap insertApplicant(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectApplicantList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectApplicantDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateApplicant(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteApplicant(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
