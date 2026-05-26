package com.switchover.legacy.ejb.privacy;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface DataMaskingRuleHome extends EJBHome {
    DataMaskingRule create() throws CreateException, RemoteException;
}