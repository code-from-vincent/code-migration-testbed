package com.switchover.legacy.ejb.legal;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Trademark extends EJBObject {
    HashMap insertTrademark(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTrademarkList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTrademarkDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTrademark(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTrademark(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
