package com.switchover.legacy.ejb.infra;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface BatchExecutionHistory extends EJBObject {
    HashMap insertBatchExecutionHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBatchExecutionHistoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBatchExecutionHistoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBatchExecutionHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBatchExecutionHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
