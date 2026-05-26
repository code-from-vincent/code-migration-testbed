package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface IntegrationEndpointLocal extends EJBLocalObject {
    HashMap insertIntegrationEndpoint(DefaultParameters param) throws DefaultEJBException;
    Collection selectIntegrationEndpointList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectIntegrationEndpointDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateIntegrationEndpoint(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteIntegrationEndpoint(DefaultParameters param) throws DefaultEJBException;
}