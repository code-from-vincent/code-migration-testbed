package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface WorkflowTask extends DefaultSession {
    HashMap insertWorkflowTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectWorkflowTaskList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectWorkflowTaskDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateWorkflowTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteWorkflowTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
