package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ClinicalTrial extends DefaultSession {
    HashMap insertClinicalTrial(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectClinicalTrialList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectClinicalTrialDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateClinicalTrial(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteClinicalTrial(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
