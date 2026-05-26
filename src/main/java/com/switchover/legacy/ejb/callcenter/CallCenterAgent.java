package com.switchover.legacy.ejb.callcenter;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface CallCenterAgent extends EJBObject {
    HashMap insertCallCenterAgent(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCallCenterAgentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCallCenterAgentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCallCenterAgent(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCallCenterAgent(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
