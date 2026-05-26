package com.switchover.legacy.ejb.hr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface AttendanceRecordHome extends EJBHome {
    AttendanceRecord create() throws CreateException, RemoteException;
}