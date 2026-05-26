package com.switchover.legacy.ejb.infra;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CapacityPlanLocalHome extends EJBLocalHome {
    CapacityPlanLocal create() throws CreateException;
}