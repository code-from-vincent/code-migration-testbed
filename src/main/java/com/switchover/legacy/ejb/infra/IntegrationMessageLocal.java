package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface IntegrationMessageLocal extends EJBLocalObject {
    HashMap insertIntegrationMessage(DefaultParameters param) throws DefaultEJBException;
    Collection selectIntegrationMessageList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectIntegrationMessageDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateIntegrationMessage(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteIntegrationMessage(DefaultParameters param) throws DefaultEJBException;
}