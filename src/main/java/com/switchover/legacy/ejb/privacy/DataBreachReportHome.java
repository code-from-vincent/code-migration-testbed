package com.switchover.legacy.ejb.privacy;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface DataBreachReportHome extends EJBHome {
    DataBreachReport create() throws CreateException, RemoteException;
}