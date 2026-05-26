package com.switchover.legacy.ejb.hr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface TrainingBudgetHome extends EJBHome {
    TrainingBudget create() throws CreateException, RemoteException;
}