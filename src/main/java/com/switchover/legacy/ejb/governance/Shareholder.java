package com.switchover.legacy.ejb.governance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Shareholder extends EJBObject {
    HashMap insertShareholder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectShareholderList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectShareholderDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateShareholder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteShareholder(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
