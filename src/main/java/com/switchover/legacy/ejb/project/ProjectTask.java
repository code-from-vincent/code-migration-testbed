package com.switchover.legacy.ejb.project;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ProjectTask extends EJBObject {
    HashMap insertProjectTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProjectTaskList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProjectTaskDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProjectTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProjectTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
