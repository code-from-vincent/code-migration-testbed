package com.switchover.legacy.ejb.procurement;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PurchaseOrderItem extends EJBObject {
    HashMap insertPurchaseOrderItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPurchaseOrderItemList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPurchaseOrderItemDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePurchaseOrderItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePurchaseOrderItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
