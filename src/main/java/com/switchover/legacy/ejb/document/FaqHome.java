package com.switchover.legacy.ejb.document;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface FaqHome extends EJBHome {
    Faq create() throws CreateException, RemoteException;
}