package com.switchover.legacy.ejb.privacy;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ThirdPartyRiskHome extends EJBHome {
    ThirdPartyRisk create() throws CreateException, RemoteException;
}