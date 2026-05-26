package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Applicant extends EJBObject {
    HashMap insertApplicant(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectApplicantList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectApplicantDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateApplicant(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteApplicant(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
