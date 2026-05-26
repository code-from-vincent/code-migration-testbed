package com.switchover.legacy.ejb.privacy;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PrivacyRequestHome extends EJBHome {
    PrivacyRequest create() throws CreateException, RemoteException;
}