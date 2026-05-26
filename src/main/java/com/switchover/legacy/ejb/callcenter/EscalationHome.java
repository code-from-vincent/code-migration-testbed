package com.switchover.legacy.ejb.callcenter;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface EscalationHome extends EJBHome {
    Escalation create() throws CreateException, RemoteException;
}