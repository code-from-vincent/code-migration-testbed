package com.switchover.legacy.ejb.callcenter;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface CorrectiveAction extends EJBObject {
    HashMap insertCorrectiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCorrectiveActionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCorrectiveActionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCorrectiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCorrectiveAction(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
