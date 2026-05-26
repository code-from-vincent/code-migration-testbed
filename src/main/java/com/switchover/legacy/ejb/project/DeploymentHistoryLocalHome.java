package com.switchover.legacy.ejb.project;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DeploymentHistoryLocalHome extends EJBLocalHome {
    DeploymentHistoryLocal create() throws CreateException;
}