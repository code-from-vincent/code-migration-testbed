package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface TrainingBudget extends EJBObject {
    HashMap insertTrainingBudget(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTrainingBudgetList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTrainingBudgetDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTrainingBudget(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTrainingBudget(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
