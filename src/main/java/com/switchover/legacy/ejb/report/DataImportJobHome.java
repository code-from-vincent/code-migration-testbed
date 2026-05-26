package com.switchover.legacy.ejb.report;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface DataImportJobHome extends EJBHome {
    DataImportJob create() throws CreateException, RemoteException;
}