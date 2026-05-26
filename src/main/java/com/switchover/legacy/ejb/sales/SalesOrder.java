package com.switchover.legacy.ejb.sales;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SalesOrder extends EJBObject {
    HashMap insertSalesOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSalesOrderList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSalesOrderDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSalesOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSalesOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
