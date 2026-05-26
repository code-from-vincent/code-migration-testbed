package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ChatSessionLocal extends EJBLocalObject {
    HashMap insertChatSession(DefaultParameters param) throws DefaultEJBException;
    Collection selectChatSessionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectChatSessionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateChatSession(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteChatSession(DefaultParameters param) throws DefaultEJBException;
}