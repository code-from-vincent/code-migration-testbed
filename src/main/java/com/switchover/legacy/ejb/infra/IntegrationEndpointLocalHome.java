package com.switchover.legacy.ejb.infra;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface IntegrationEndpointLocalHome extends EJBLocalHome {
    IntegrationEndpointLocal create() throws CreateException;
}