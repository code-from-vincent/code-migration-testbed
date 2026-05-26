package com.switchover.legacy.ejb.infra;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface IntegrationEndpointHome extends EJBHome {
    IntegrationEndpoint create() throws CreateException, RemoteException;
}