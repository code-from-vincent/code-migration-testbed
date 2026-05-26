package com.switchover.legacy.ejb.rd;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ClinicalTrial extends EJBObject {
    HashMap insertClinicalTrial(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectClinicalTrialList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectClinicalTrialDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateClinicalTrial(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteClinicalTrial(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
