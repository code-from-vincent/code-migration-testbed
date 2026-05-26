package com.switchover.legacy.ejb.callcenter;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ChatSessionHome extends EJBHome {
    ChatSession create() throws CreateException, RemoteException;
}