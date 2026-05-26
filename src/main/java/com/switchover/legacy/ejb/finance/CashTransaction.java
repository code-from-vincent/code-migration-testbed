package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface CashTransaction extends EJBObject {
    HashMap insertCashTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCashTransactionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCashTransactionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCashTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCashTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
