package com.switchover.legacy.ejb.product;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ProductHome extends EJBHome {
    Product create() throws CreateException, RemoteException;
}