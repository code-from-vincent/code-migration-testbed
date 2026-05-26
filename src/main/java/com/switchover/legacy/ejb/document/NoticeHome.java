package com.switchover.legacy.ejb.document;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface NoticeHome extends EJBHome {
    Notice create() throws CreateException, RemoteException;
}