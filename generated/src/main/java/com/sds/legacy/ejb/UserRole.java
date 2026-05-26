package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface UserRole extends DefaultSession {
    HashMap insertUserRole(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectUserRoleList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectUserRoleDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateUserRole(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteUserRole(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
