package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface CallCenterAgent extends DefaultSession {
    HashMap insertCallCenterAgent(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCallCenterAgentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCallCenterAgentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCallCenterAgent(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCallCenterAgent(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
