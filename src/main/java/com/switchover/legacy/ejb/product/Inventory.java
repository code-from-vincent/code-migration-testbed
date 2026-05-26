package com.switchover.legacy.ejb.product;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Inventory extends EJBObject {
    HashMap insertInventory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectInventoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectInventoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateInventory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteInventory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
