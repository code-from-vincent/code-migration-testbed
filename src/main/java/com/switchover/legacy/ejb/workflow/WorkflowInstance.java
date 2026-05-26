package com.switchover.legacy.ejb.workflow;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface WorkflowInstance extends EJBObject {
    HashMap insertWorkflowInstance(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectWorkflowInstanceList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectWorkflowInstanceDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateWorkflowInstance(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteWorkflowInstance(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
