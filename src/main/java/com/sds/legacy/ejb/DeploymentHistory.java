package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface DeploymentHistory extends DefaultSession {
    HashMap insertDeploymentHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDeploymentHistoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDeploymentHistoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDeploymentHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDeploymentHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
