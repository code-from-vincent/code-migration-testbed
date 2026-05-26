package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ConfigurationItem extends DefaultSession {
    HashMap insertConfigurationItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectConfigurationItemList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectConfigurationItemDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateConfigurationItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteConfigurationItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
