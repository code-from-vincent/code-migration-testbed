package com.switchover.legacy.ejb.document;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SurveyResponseHome extends EJBHome {
    SurveyResponse create() throws CreateException, RemoteException;
}