package com.switchover.legacy.ejb.callcenter;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface FeedbackHome extends EJBHome {
    Feedback create() throws CreateException, RemoteException;
}