package com.switchover.legacy.ejb.finance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ExpenseReportHome extends EJBHome {
    ExpenseReport create() throws CreateException, RemoteException;
}