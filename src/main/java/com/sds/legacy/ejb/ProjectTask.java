package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ProjectTask extends DefaultSession {
    HashMap insertProjectTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProjectTaskList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProjectTaskDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProjectTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProjectTask(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
