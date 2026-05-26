package com.switchover.legacy.ejb.callcenter;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ComplaintHome extends EJBHome {
    Complaint create() throws CreateException, RemoteException;
}