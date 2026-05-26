package com.switchover.legacy.ejb.hr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface TrainingCourseHome extends EJBHome {
    TrainingCourse create() throws CreateException, RemoteException;
}