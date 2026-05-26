package com.switchover.legacy.ejb.callcenter;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Escalation extends EJBObject {
    HashMap insertEscalation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectEscalationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectEscalationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateEscalation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteEscalation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
