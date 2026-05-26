package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ProblemRecord extends DefaultSession {
    HashMap insertProblemRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProblemRecordList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProblemRecordDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProblemRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProblemRecord(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
