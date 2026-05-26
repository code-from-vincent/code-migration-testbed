package com.switchover.legacy.ejb.hr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface EmployeeProfileHome extends EJBHome {
    EmployeeProfile create() throws CreateException, RemoteException;
}