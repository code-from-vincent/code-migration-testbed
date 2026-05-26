package com.switchover.legacy.ejb.callcenter;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RootCauseAnalysisHome extends EJBHome {
    RootCauseAnalysis create() throws CreateException, RemoteException;
}