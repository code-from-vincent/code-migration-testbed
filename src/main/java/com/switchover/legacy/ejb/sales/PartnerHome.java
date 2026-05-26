package com.switchover.legacy.ejb.sales;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PartnerHome extends EJBHome {
    Partner create() throws CreateException, RemoteException;
}