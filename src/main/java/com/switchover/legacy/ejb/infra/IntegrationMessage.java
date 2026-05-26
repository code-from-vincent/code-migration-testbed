package com.switchover.legacy.ejb.infra;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface IntegrationMessage extends EJBObject {
    HashMap insertIntegrationMessage(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectIntegrationMessageList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectIntegrationMessageDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateIntegrationMessage(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteIntegrationMessage(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
