package com.switchover.legacy.ejb.itsm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ServiceLevelAgreementHome extends EJBHome {
    ServiceLevelAgreement create() throws CreateException, RemoteException;
}