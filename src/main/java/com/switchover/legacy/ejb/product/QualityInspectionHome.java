package com.switchover.legacy.ejb.product;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface QualityInspectionHome extends EJBHome {
    QualityInspection create() throws CreateException, RemoteException;
}