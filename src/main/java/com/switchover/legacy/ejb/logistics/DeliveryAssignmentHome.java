package com.switchover.legacy.ejb.logistics;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface DeliveryAssignmentHome extends EJBHome {
    DeliveryAssignment create() throws CreateException, RemoteException;
}