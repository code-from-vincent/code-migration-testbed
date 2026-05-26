package com.switchover.legacy.ejb.manufacturing;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ProductionPlanLocalHome extends EJBLocalHome {
    ProductionPlanLocal create() throws CreateException;
}