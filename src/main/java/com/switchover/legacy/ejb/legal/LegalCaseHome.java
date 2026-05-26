package com.switchover.legacy.ejb.legal;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface LegalCaseHome extends EJBHome {
    LegalCase create() throws CreateException, RemoteException;
}