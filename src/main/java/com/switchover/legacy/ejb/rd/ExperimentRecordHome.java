package com.switchover.legacy.ejb.rd;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ExperimentRecordHome extends EJBHome {
    ExperimentRecord create() throws CreateException, RemoteException;
}