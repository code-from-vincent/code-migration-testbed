package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface TrainingEnrollment extends DefaultSession {
    HashMap insertTrainingEnrollment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTrainingEnrollmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTrainingEnrollmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTrainingEnrollment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTrainingEnrollment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
