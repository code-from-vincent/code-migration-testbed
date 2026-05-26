package com.switchover.legacy.ejb.hr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PerformanceReviewHome extends EJBHome {
    PerformanceReview create() throws CreateException, RemoteException;
}