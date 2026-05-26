package com.switchover.legacy.ejb.system;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Menu extends EJBObject {
    HashMap insertMenu(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMenuList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMenuDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMenu(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMenu(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
