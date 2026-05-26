package com.switchover.legacy.ejb.workflow;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface WorkflowTask extends EJBObject {
    HashMap insertWorkflowTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectWorkflowTaskList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectWorkflowTaskDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateWorkflowTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteWorkflowTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
