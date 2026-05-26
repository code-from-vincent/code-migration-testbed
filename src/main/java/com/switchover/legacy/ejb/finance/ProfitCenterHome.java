package com.switchover.legacy.ejb.finance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ProfitCenterHome extends EJBHome {
    ProfitCenter create() throws CreateException, RemoteException;
}