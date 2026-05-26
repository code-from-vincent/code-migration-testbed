package com.switchover.legacy.ejb.infra;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ApiAccessLogHome extends EJBHome {
    ApiAccessLog create() throws CreateException, RemoteException;
}