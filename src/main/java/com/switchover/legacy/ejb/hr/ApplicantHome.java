package com.switchover.legacy.ejb.hr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ApplicantHome extends EJBHome {
    Applicant create() throws CreateException, RemoteException;
}