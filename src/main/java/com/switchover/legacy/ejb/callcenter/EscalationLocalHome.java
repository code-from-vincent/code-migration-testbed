package com.switchover.legacy.ejb.callcenter;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface EscalationLocalHome extends EJBLocalHome {
    EscalationLocal create() throws CreateException;
}