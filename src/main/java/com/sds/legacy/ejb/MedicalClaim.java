package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface MedicalClaim extends DefaultSession {
    HashMap insertMedicalClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMedicalClaimList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMedicalClaimDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMedicalClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMedicalClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
