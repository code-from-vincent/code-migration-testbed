package com.switchover.legacy.ejb.manufacturing;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface WorkOrder extends EJBObject {
    HashMap insertWorkOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectWorkOrderList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectWorkOrderDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateWorkOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteWorkOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
