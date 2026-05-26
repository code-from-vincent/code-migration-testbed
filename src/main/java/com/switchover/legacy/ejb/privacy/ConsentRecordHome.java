package com.switchover.legacy.ejb.privacy;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ConsentRecordHome extends EJBHome {
    ConsentRecord create() throws CreateException, RemoteException;
}