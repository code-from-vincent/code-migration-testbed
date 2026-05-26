package com.switchover.legacy.ejb.sales;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Shipment extends EJBObject {
    HashMap insertShipment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectShipmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectShipmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateShipment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteShipment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
