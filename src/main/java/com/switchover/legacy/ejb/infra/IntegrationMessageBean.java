package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class IntegrationMessageBean extends DefaultSession {
    private final IntegrationMessageEJBDAO integrationMessageEJBDAO = new IntegrationMessageEJBDAO();
    public HashMap insertIntegrationMessage(DefaultParameters param) throws DefaultEJBException {
        return integrationMessageEJBDAO.insertIntegrationMessage(param);
    }
    public Collection selectIntegrationMessageList(DefaultParameters param) throws DefaultEJBException {
        return integrationMessageEJBDAO.selectIntegrationMessageList(param);
    }
    public HashMap selectIntegrationMessageDetail(DefaultParameters param) throws DefaultEJBException {
        return integrationMessageEJBDAO.selectIntegrationMessageDetail(param);
    }
    public HashMap updateIntegrationMessage(DefaultParameters param) throws DefaultEJBException {
        return integrationMessageEJBDAO.updateIntegrationMessage(param);
    }
    public HashMap deleteIntegrationMessage(DefaultParameters param) throws DefaultEJBException {
        return integrationMessageEJBDAO.deleteIntegrationMessage(param);
    }
}