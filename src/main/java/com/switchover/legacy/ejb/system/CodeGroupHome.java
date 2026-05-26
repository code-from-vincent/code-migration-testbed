package com.switchover.legacy.ejb.system;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface CodeGroupHome extends EJBHome {
    CodeGroup create() throws CreateException, RemoteException;
}