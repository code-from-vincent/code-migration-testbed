package com.switchover.legacy.ejb.logistics;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface FuelTransaction extends EJBObject {
    HashMap insertFuelTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFuelTransactionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFuelTransactionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFuelTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFuelTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
