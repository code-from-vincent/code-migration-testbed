package com.switchover.legacy.ejb.security;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PasswordPolicy extends EJBObject {
    HashMap insertPasswordPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPasswordPolicyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPasswordPolicyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePasswordPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePasswordPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
