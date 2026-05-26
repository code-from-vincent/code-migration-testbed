package com.switchover.legacy.ejb.rd;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ResearchProjectHome extends EJBHome {
    ResearchProject create() throws CreateException, RemoteException;
}