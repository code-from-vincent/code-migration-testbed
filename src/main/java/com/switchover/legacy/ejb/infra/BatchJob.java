package com.switchover.legacy.ejb.infra;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface BatchJob extends EJBObject {
    HashMap insertBatchJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBatchJobList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBatchJobDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBatchJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBatchJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
