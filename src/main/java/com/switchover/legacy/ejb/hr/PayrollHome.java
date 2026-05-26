package com.switchover.legacy.ejb.hr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PayrollHome extends EJBHome {
    Payroll create() throws CreateException, RemoteException;
}