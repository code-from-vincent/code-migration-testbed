package com.switchover.legacy.ejb.procurement;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface BidEvaluationHome extends EJBHome {
    BidEvaluation create() throws CreateException, RemoteException;
}