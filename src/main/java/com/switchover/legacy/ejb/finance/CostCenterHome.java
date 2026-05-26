package com.switchover.legacy.ejb.finance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface CostCenterHome extends EJBHome {
    CostCenter create() throws CreateException, RemoteException;
}