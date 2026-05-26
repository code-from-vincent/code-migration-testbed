package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface BatchJob extends DefaultSession {
    HashMap insertBatchJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBatchJobList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBatchJobDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBatchJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBatchJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
