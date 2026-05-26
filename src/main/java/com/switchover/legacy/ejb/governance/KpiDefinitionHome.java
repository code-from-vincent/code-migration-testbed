package com.switchover.legacy.ejb.governance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface KpiDefinitionHome extends EJBHome {
    KpiDefinition create() throws CreateException, RemoteException;
}