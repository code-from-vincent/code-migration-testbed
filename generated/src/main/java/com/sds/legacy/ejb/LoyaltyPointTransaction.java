package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface LoyaltyPointTransaction extends DefaultSession {
    HashMap insertLoyaltyPointTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectLoyaltyPointTransactionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectLoyaltyPointTransactionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateLoyaltyPointTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteLoyaltyPointTransaction(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
