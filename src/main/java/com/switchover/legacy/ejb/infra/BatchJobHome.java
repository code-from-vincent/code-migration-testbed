package com.switchover.legacy.ejb.infra;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface BatchJobHome extends EJBHome {
    BatchJob create() throws CreateException, RemoteException;
}