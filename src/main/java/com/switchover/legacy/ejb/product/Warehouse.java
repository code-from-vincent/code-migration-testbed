package com.switchover.legacy.ejb.product;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Warehouse extends EJBObject {
    HashMap insertWarehouse(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectWarehouseList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectWarehouseDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateWarehouse(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteWarehouse(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
