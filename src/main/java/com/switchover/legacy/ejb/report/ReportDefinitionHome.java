package com.switchover.legacy.ejb.report;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ReportDefinitionHome extends EJBHome {
    ReportDefinition create() throws CreateException, RemoteException;
}