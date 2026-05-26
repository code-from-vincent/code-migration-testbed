package com.switchover.legacy.ejb.crm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface MarketingSegmentHome extends EJBHome {
    MarketingSegment create() throws CreateException, RemoteException;
}