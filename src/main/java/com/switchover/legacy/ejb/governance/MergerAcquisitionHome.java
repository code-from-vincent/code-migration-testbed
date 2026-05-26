package com.switchover.legacy.ejb.governance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface MergerAcquisitionHome extends EJBHome {
    MergerAcquisition create() throws CreateException, RemoteException;
}