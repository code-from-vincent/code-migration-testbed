package com.switchover.legacy.ejb.callcenter;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PreventiveAction extends EJBObject {
    HashMap insertPreventiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPreventiveActionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPreventiveActionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePreventiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePreventiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
