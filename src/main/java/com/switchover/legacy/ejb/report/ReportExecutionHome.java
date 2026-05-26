package com.switchover.legacy.ejb.report;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ReportExecutionHome extends EJBHome {
    ReportExecution create() throws CreateException, RemoteException;
}