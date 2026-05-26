package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface FeatureFlagHome extends EJBHome {
    FeatureFlag create() throws CreateException, RemoteException;
}