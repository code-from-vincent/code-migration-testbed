package com.switchover.legacy.ejb.crm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface LoyaltyAccount extends EJBObject {
    HashMap insertLoyaltyAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectLoyaltyAccountList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectLoyaltyAccountDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateLoyaltyAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteLoyaltyAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
