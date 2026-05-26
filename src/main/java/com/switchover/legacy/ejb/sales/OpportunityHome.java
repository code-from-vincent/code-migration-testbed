package com.switchover.legacy.ejb.sales;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface OpportunityHome extends EJBHome {
    Opportunity create() throws CreateException, RemoteException;
}