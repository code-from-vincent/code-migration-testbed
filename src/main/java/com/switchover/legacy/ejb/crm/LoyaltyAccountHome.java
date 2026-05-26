package com.switchover.legacy.ejb.crm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface LoyaltyAccountHome extends EJBHome {
    LoyaltyAccount create() throws CreateException, RemoteException;
}