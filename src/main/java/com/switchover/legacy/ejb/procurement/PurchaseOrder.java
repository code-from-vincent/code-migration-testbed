package com.switchover.legacy.ejb.procurement;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PurchaseOrder extends EJBObject {
    HashMap insertPurchaseOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPurchaseOrderList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPurchaseOrderDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePurchaseOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePurchaseOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
