package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PurchaseOrderItem extends DefaultSession {
    HashMap insertPurchaseOrderItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPurchaseOrderItemList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPurchaseOrderItemDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePurchaseOrderItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePurchaseOrderItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
