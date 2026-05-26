package com.switchover.legacy.ejb.product;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PricePolicyHome extends EJBHome {
    PricePolicy create() throws CreateException, RemoteException;
}