package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CallCenterAgentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/callcenter/138_callcenteragent/CallCenterAgent_SQL.xml";
    public HashMap insertCallCenterAgent(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CallCenterAgentEJBDAO.InsertCallCenterAgent", param);
    }
    public Collection selectCallCenterAgentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CallCenterAgentEJBDAO.SelectCallCenterAgentList", param);
    }
    public HashMap selectCallCenterAgentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CallCenterAgentEJBDAO.SelectCallCenterAgentDetail", param);
    }
    public HashMap updateCallCenterAgent(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CallCenterAgentEJBDAO.UpdateCallCenterAgent", param);
    }
    public HashMap deleteCallCenterAgent(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CallCenterAgentEJBDAO.DeleteCallCenterAgent", param);
    }
}