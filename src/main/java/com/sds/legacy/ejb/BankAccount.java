package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface BankAccount extends DefaultSession {
    HashMap insertBankAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBankAccountList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBankAccountDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBankAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBankAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
