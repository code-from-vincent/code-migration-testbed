package com.switchover.legacy.ejb.system;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SystemConfig extends EJBObject {
    HashMap insertSystemConfig(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSystemConfigList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSystemConfigDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSystemConfig(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSystemConfig(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
