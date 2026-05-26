package com.switchover.legacy.ejb.crm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface LoyaltyPointTransactionHome extends EJBHome {
    LoyaltyPointTransaction create() throws CreateException, RemoteException;
}