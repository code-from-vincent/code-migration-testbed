package com.switchover.legacy.ejb.callcenter;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface CallCenterAgentHome extends EJBHome {
    CallCenterAgent create() throws CreateException, RemoteException;
}