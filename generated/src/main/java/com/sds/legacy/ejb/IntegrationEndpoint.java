package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface IntegrationEndpoint extends DefaultSession {
    HashMap insertIntegrationEndpoint(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectIntegrationEndpointList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectIntegrationEndpointDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateIntegrationEndpoint(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteIntegrationEndpoint(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
