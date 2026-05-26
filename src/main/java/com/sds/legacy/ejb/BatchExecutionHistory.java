package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface BatchExecutionHistory extends DefaultSession {
    HashMap insertBatchExecutionHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBatchExecutionHistoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBatchExecutionHistoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBatchExecutionHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBatchExecutionHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
