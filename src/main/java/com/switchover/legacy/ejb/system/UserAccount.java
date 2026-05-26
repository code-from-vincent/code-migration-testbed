package com.switchover.legacy.ejb.system;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface UserAccount extends EJBObject {
    HashMap insertUserAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectUserAccountList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectUserAccountDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateUserAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteUserAccount(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
