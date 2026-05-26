package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PurchaseOrder extends DefaultSession {
    HashMap insertPurchaseOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPurchaseOrderList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPurchaseOrderDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePurchaseOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePurchaseOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
