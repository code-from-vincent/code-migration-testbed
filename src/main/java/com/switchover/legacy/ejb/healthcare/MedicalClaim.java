package com.switchover.legacy.ejb.healthcare;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface MedicalClaim extends EJBObject {
    HashMap insertMedicalClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMedicalClaimList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMedicalClaimDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMedicalClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMedicalClaim(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
