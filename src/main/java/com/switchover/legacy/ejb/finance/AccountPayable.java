package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface AccountPayable extends EJBObject {
    HashMap insertAccountPayable(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAccountPayableList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAccountPayableDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAccountPayable(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAccountPayable(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
