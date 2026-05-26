package com.switchover.legacy.ejb.crm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface MarketingSegment extends EJBObject {
    HashMap insertMarketingSegment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMarketingSegmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMarketingSegmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMarketingSegment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMarketingSegment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
