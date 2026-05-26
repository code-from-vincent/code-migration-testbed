package com.switchover.legacy.ejb.facility;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface FacilityHome extends EJBHome {
    Facility create() throws CreateException, RemoteException;
}