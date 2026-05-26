package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class IntegrationEndpointBean extends DefaultSession {
    private final IntegrationEndpointEJBDAO integrationEndpointEJBDAO = new IntegrationEndpointEJBDAO();
    public HashMap insertIntegrationEndpoint(DefaultParameters param) throws DefaultEJBException {
        return integrationEndpointEJBDAO.insertIntegrationEndpoint(param);
    }
    public Collection selectIntegrationEndpointList(DefaultParameters param) throws DefaultEJBException {
        return integrationEndpointEJBDAO.selectIntegrationEndpointList(param);
    }
    public HashMap selectIntegrationEndpointDetail(DefaultParameters param) throws DefaultEJBException {
        return integrationEndpointEJBDAO.selectIntegrationEndpointDetail(param);
    }
    public HashMap updateIntegrationEndpoint(DefaultParameters param) throws DefaultEJBException {
        return integrationEndpointEJBDAO.updateIntegrationEndpoint(param);
    }
    public HashMap deleteIntegrationEndpoint(DefaultParameters param) throws DefaultEJBException {
        return integrationEndpointEJBDAO.deleteIntegrationEndpoint(param);
    }
}