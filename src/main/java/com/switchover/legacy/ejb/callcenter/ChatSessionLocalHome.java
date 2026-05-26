package com.switchover.legacy.ejb.callcenter;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ChatSessionLocalHome extends EJBLocalHome {
    ChatSessionLocal create() throws CreateException;
}