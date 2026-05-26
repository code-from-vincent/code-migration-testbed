package com.switchover.legacy.ejb.callcenter;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface CallRecordHome extends EJBHome {
    CallRecord create() throws CreateException, RemoteException;
}