package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ChatSession extends DefaultSession {
    HashMap insertChatSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectChatSessionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectChatSessionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateChatSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteChatSession(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
