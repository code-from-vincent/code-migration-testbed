package com.switchover.legacy.ejb.esg;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface CarbonEmissionHome extends EJBHome {
    CarbonEmission create() throws CreateException, RemoteException;
}