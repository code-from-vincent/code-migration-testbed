package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface AccountReceivable extends EJBObject {
    HashMap insertAccountReceivable(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAccountReceivableList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAccountReceivableDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAccountReceivable(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAccountReceivable(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
