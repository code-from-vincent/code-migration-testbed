package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CallCenterAgentBean extends DefaultSession {
    private final CallCenterAgentEJBDAO callCenterAgentEJBDAO = new CallCenterAgentEJBDAO();
    public HashMap insertCallCenterAgent(DefaultParameters param) throws DefaultEJBException {
        return callCenterAgentEJBDAO.insertCallCenterAgent(param);
    }
    public Collection selectCallCenterAgentList(DefaultParameters param) throws DefaultEJBException {
        return callCenterAgentEJBDAO.selectCallCenterAgentList(param);
    }
    public HashMap selectCallCenterAgentDetail(DefaultParameters param) throws DefaultEJBException {
        return callCenterAgentEJBDAO.selectCallCenterAgentDetail(param);
    }
    public HashMap updateCallCenterAgent(DefaultParameters param) throws DefaultEJBException {
        return callCenterAgentEJBDAO.updateCallCenterAgent(param);
    }
    public HashMap deleteCallCenterAgent(DefaultParameters param) throws DefaultEJBException {
        return callCenterAgentEJBDAO.deleteCallCenterAgent(param);
    }
}