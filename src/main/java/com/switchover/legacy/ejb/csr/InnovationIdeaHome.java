package com.switchover.legacy.ejb.csr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface InnovationIdeaHome extends EJBHome {
    InnovationIdea create() throws CreateException, RemoteException;
}