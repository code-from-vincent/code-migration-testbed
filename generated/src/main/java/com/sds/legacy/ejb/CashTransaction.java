package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface CashTransaction extends DefaultSession {
    HashMap insertCashTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCashTransactionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCashTransactionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCashTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCashTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
