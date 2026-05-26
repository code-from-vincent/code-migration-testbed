package com.switchover.legacy.ejb.healthcare;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Prescription extends EJBObject {
    HashMap insertPrescription(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPrescriptionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPrescriptionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePrescription(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePrescription(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
