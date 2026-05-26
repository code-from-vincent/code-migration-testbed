package com.switchover.legacy.ejb.itsm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ConfigurationItem extends EJBObject {
    HashMap insertConfigurationItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectConfigurationItemList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectConfigurationItemDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateConfigurationItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteConfigurationItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
