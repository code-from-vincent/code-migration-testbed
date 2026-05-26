package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PatientRecord extends DefaultSession {
    HashMap insertPatientRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPatientRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPatientRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePatientRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePatientRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
