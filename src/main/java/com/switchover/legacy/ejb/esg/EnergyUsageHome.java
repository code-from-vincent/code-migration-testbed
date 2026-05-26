package com.switchover.legacy.ejb.esg;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface EnergyUsageHome extends EJBHome {
    EnergyUsage create() throws CreateException, RemoteException;
}