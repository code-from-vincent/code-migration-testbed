package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface BankAccount extends EJBObject {
    HashMap insertBankAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBankAccountList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBankAccountDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBankAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBankAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
