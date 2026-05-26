package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface WorkflowDefinition extends DefaultSession {
    HashMap insertWorkflowDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectWorkflowDefinitionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectWorkflowDefinitionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateWorkflowDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteWorkflowDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
