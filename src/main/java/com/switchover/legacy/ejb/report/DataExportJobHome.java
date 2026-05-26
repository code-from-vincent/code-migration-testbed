package com.switchover.legacy.ejb.report;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface DataExportJobHome extends EJBHome {
    DataExportJob create() throws CreateException, RemoteException;
}