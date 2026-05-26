package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface TrainingEnrollment extends EJBObject {
    HashMap insertTrainingEnrollment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTrainingEnrollmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTrainingEnrollmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTrainingEnrollment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTrainingEnrollment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
