package com.switchover.legacy.ejb.rd;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ClinicalTrialHome extends EJBHome {
    ClinicalTrial create() throws CreateException, RemoteException;
}