package com.switchover.legacy.ejb.callcenter;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CallCenterAgentLocalHome extends EJBLocalHome {
    CallCenterAgentLocal create() throws CreateException;
}