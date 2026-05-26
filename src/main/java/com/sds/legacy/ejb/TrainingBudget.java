package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface TrainingBudget extends DefaultSession {
    HashMap insertTrainingBudget(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTrainingBudgetList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTrainingBudgetDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTrainingBudget(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTrainingBudget(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
