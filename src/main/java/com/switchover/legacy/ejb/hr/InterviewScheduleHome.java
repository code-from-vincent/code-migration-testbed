package com.switchover.legacy.ejb.hr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface InterviewScheduleHome extends EJBHome {
    InterviewSchedule create() throws CreateException, RemoteException;
}