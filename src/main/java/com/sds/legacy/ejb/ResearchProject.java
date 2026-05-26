package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ResearchProject extends DefaultSession {
    HashMap insertResearchProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectResearchProjectList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectResearchProjectDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateResearchProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteResearchProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
