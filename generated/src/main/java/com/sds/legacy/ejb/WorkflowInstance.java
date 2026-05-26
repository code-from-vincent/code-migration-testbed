package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface WorkflowInstance extends DefaultSession {
    HashMap insertWorkflowInstance(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectWorkflowInstanceList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectWorkflowInstanceDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateWorkflowInstance(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteWorkflowInstance(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
