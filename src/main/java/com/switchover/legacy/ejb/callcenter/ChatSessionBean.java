package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ChatSessionBean extends DefaultSession {
    private final ChatSessionEJBDAO chatSessionEJBDAO = new ChatSessionEJBDAO();
    public HashMap insertChatSession(DefaultParameters param) throws DefaultEJBException {
        return chatSessionEJBDAO.insertChatSession(param);
    }
    public Collection selectChatSessionList(DefaultParameters param) throws DefaultEJBException {
        return chatSessionEJBDAO.selectChatSessionList(param);
    }
    public HashMap selectChatSessionDetail(DefaultParameters param) throws DefaultEJBException {
        return chatSessionEJBDAO.selectChatSessionDetail(param);
    }
    public HashMap updateChatSession(DefaultParameters param) throws DefaultEJBException {
        return chatSessionEJBDAO.updateChatSession(param);
    }
    public HashMap deleteChatSession(DefaultParameters param) throws DefaultEJBException {
        return chatSessionEJBDAO.deleteChatSession(param);
    }
}