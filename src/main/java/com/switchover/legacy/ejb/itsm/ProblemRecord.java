package com.switchover.legacy.ejb.itsm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ProblemRecord extends EJBObject {
    HashMap insertProblemRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProblemRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProblemRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProblemRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProblemRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
