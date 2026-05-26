package com.switchover.legacy.ejb.procurement;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ProcurementBid extends EJBObject {
    HashMap insertProcurementBid(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProcurementBidList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProcurementBidDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProcurementBid(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProcurementBid(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
