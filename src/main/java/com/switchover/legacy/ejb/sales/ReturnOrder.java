package com.switchover.legacy.ejb.sales;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ReturnOrder extends EJBObject {
    HashMap insertReturnOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectReturnOrderList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectReturnOrderDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateReturnOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteReturnOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
