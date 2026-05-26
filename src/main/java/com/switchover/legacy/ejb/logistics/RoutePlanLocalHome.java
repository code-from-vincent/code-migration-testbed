package com.switchover.legacy.ejb.logistics;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface RoutePlanLocalHome extends EJBLocalHome {
    RoutePlanLocal create() throws CreateException;
}