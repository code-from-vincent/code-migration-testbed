package com.switchover.legacy.ejb.csr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface GrantApplication extends EJBObject {
    HashMap insertGrantApplication(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectGrantApplicationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectGrantApplicationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateGrantApplication(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteGrantApplication(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
