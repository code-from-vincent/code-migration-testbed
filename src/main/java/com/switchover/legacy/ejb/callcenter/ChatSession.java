package com.switchover.legacy.ejb.callcenter;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ChatSession extends EJBObject {
    HashMap insertChatSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectChatSessionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectChatSessionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateChatSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteChatSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
