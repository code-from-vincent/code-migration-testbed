package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Prescription extends DefaultSession {
    HashMap insertPrescription(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPrescriptionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPrescriptionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePrescription(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePrescription(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
