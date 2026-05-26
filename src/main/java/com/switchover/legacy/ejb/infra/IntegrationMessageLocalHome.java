package com.switchover.legacy.ejb.infra;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface IntegrationMessageLocalHome extends EJBLocalHome {
    IntegrationMessageLocal create() throws CreateException;
}