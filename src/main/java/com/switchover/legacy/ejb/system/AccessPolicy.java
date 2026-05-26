package com.switchover.legacy.ejb.system;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface AccessPolicy extends EJBObject {
    HashMap insertAccessPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAccessPolicyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAccessPolicyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAccessPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAccessPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
