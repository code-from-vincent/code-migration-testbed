package com.switchover.legacy.ejb.itsm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ProblemRecordHome extends EJBHome {
    ProblemRecord create() throws CreateException, RemoteException;
}