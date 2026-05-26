package com.switchover.legacy.ejb.sales;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SalesLeadHome extends EJBHome {
    SalesLead create() throws CreateException, RemoteException;
}