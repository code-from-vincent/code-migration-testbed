package com.switchover.legacy.ejb.itsm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface KnowledgeCategoryHome extends EJBHome {
    KnowledgeCategory create() throws CreateException, RemoteException;
}