package com.switchover.legacy.ejb.healthcare;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PatientRecord extends EJBObject {
    HashMap insertPatientRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPatientRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPatientRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePatientRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePatientRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
