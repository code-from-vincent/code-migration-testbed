package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Project extends DefaultSession {
    HashMap insertProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProjectList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProjectDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
