package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CallCenterAgentLocal extends EJBLocalObject {
    HashMap insertCallCenterAgent(DefaultParameters param) throws DefaultEJBException;
    Collection selectCallCenterAgentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCallCenterAgentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCallCenterAgent(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCallCenterAgent(DefaultParameters param) throws DefaultEJBException;
}