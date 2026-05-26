package com.switchover.legacy.ejb.facility;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface BranchOfficeHome extends EJBHome {
    BranchOffice create() throws CreateException, RemoteException;
}