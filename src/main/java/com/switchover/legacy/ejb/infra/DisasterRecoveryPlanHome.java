package com.switchover.legacy.ejb.infra;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface DisasterRecoveryPlanHome extends EJBHome {
    DisasterRecoveryPlan create() throws CreateException, RemoteException;
}