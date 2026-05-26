package com.switchover.legacy.ejb.sales;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PartnerSettlementHome extends EJBHome {
    PartnerSettlement create() throws CreateException, RemoteException;
}