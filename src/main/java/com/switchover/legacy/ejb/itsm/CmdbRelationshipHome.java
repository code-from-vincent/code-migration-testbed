package com.switchover.legacy.ejb.itsm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface CmdbRelationshipHome extends EJBHome {
    CmdbRelationship create() throws CreateException, RemoteException;
}