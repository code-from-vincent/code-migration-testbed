package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ChatSessionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/callcenter/140_chatsession/ChatSession_SQL.xml";
    public HashMap insertChatSession(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ChatSessionEJBDAO.InsertChatSession", param);
    }
    public Collection selectChatSessionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ChatSessionEJBDAO.SelectChatSessionList", param);
    }
    public HashMap selectChatSessionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ChatSessionEJBDAO.SelectChatSessionDetail", param);
    }
    public HashMap updateChatSession(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ChatSessionEJBDAO.UpdateChatSession", param);
    }
    public HashMap deleteChatSession(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ChatSessionEJBDAO.DeleteChatSession", param);
    }
}