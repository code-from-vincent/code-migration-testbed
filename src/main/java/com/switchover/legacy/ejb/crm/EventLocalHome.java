package com.switchover.legacy.ejb.crm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface EventLocalHome extends EJBLocalHome {
    EventLocal create() throws CreateException;
}