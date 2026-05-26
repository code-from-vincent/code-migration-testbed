package com.switchover.legacy.ejb.system;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface UserRole extends EJBObject {
    HashMap insertUserRole(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectUserRoleList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectUserRoleDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateUserRole(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteUserRole(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
