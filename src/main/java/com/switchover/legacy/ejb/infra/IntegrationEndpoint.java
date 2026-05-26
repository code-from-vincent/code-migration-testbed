package com.switchover.legacy.ejb.infra;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface IntegrationEndpoint extends EJBObject {
    HashMap insertIntegrationEndpoint(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectIntegrationEndpointList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectIntegrationEndpointDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateIntegrationEndpoint(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteIntegrationEndpoint(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
