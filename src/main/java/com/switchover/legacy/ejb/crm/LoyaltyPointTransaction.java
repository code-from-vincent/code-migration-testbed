package com.switchover.legacy.ejb.crm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface LoyaltyPointTransaction extends EJBObject {
    HashMap insertLoyaltyPointTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectLoyaltyPointTransactionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectLoyaltyPointTransactionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateLoyaltyPointTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteLoyaltyPointTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
