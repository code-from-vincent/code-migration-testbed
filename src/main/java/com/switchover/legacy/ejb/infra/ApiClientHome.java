package com.switchover.legacy.ejb.infra;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ApiClientHome extends EJBHome {
    ApiClient create() throws CreateException, RemoteException;
}