package com.switchover.legacy.ejb.infra;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface BackupJobHome extends EJBHome {
    BackupJob create() throws CreateException, RemoteException;
}