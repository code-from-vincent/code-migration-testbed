package com.switchover.legacy.ejb.workflow;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface WorkflowDefinition extends EJBObject {
    HashMap insertWorkflowDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectWorkflowDefinitionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectWorkflowDefinitionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateWorkflowDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteWorkflowDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
