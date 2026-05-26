package com.switchover.legacy.ejb.rd;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ExperimentRecord extends EJBObject {
    HashMap insertExperimentRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectExperimentRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectExperimentRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateExperimentRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteExperimentRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
