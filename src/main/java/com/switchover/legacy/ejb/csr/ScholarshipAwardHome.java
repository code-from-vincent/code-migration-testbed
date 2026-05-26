package com.switchover.legacy.ejb.csr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ScholarshipAwardHome extends EJBHome {
    ScholarshipAward create() throws CreateException, RemoteException;
}